package com.casyazmon.stageonetask;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.DayOfWeek;

@Data
@Builder
@AllArgsConstructor
public class InfoEntity {
    private String slack_name;
    private DayOfWeek current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;



}



