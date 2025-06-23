package com.example.job_scrapper.utils;

public class ReferenceModifier {

    public static String addStartUri(String uri) {
        return "https://jobs.techstars.com/" + uri;
    }

    public static String createRequestUri(String uri, String uriParameters) {
        return uri + uriParameters;
    }
}
