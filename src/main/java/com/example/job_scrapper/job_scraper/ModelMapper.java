package com.example.job_scrapper.job_scraper;

import com.example.job_scrapper.job_scraper.model.Job;
import com.example.job_scrapper.job_scraper.model.JobEntity;
import com.example.job_scrapper.utils.TimeUtils;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class ModelMapper {
    public List<JobEntity> mapJobToJobEntity(List<Job> jobs){
        List<JobEntity> mappedList = new ArrayList<>();
        for(Job job:jobs) {
            mappedList.add(new JobEntity(
                    job.getJobPageUrl(),
                    job.getPositionName(),
                    job.getUrlToOrganization(),
                    job.getLogoUrl(),
                    job.getOrganizationTitle(),
                    job.getLaborFunction(),
                    job.getAddress(),
                    TimeUtils.convertStringDateToTimeStamp(job.getPostedDate()),
                    job.getDescription(),
                    job.getTagName())
            );
        }
        return mappedList;
    }
}
