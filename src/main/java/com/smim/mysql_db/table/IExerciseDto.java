package com.smim.mysql_db.table;

import lombok.Getter;

import java.util.Date;

@Getter
public class IExerciseDto {
    private Long ie_num;
    private String ie_name;
    private Date ie_sec;
    private String ie_dsec;
}
