package com.smim.mysql_db.table;

import lombok.Getter;

import java.time.LocalTime;

@Getter
public class GExerciseDto {
    private Long ge_num;
    private String ge_name;
    private String ge_desc;
    private String ge_date;
    private LocalTime ge_start_time;
    private LocalTime ge_end_time;
    private String ge_run_time;
    private String video_url;
}
