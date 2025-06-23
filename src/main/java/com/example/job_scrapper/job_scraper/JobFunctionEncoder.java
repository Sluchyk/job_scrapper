package com.example.job_scrapper.job_scraper;

import com.example.job_scrapper.MessageConstants;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import org.springframework.stereotype.Component;

@Component
public class JobFunctionEncoder {
    private final static String REGEX = "\\.";
    public String encodeJobFunction(String[] jobFunction){
        SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String encodedJobFunction = Jwts.builder().
                claim(MessageConstants.JOB_FUNCTION,jobFunction)
                .signWith(key)
                .compact();
        return getOnlyPayLoad(encodedJobFunction);
    }
    private String getOnlyPayLoad(String encodedJobFunction){
        String[] splitToken = encodedJobFunction.split(REGEX);
        return splitToken[1];
    }
}
