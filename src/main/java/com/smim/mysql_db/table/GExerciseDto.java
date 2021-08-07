package com.smim.mysql_db.table;

import lombok.Getter;

import java.time.LocalTime;
import java.util.Date;

@Getter
public class GExerciseDto {
    private Long ge_num;
    private String ge_desc;
    private Date ge_date;
    private LocalTime ge_start_time;
    private LocalTime ge_end_time;
    private LocalTime ge_run_time;
    private String video_url;
    private int group_num;
}
