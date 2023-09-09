package com.casyazmon.StageOneTask;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


@Service
public class InfoService {
    String github_file_url = "https://github.com/casyazmon/HNGx-project/blob/main/StageOneTask/src/main/java/com/casyazmon/StageOneTask/InfoService.java";
    String github_repo_url = "https://github.com/casyazmon/HNGx-project/tree/main/StageOneTask";

    public InfoEntity getInfo(String slack_name, String track){

        DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime utcTime = ZonedDateTime.of(currentTime, ZoneId.of("UTC")).toLocalDateTime();

        // Format the UTC time as a string in the desired format (e.g., "2023-08-21T15:04:05Z")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String formattedTime = utcTime.format(formatter);

        return InfoEntity.builder()
                .slack_name(slack_name)
                .current_day(dayOfWeek)
                .utc_time(formattedTime)
                .track(track)
                .github_file_url(github_file_url)
                .github_repo_url(github_repo_url)
                .status_code(200)
                .build();

    }

}


