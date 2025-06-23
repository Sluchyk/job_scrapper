
FROM openjdk:17-jdk-slim
COPY target/job_scrapper-0.0.1-SNAPSHOT.jar  job_scrapper-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "job_scrapper-0.0.1-SNAPSHOT.jar"]
