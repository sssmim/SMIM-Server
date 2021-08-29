package com.smim.mysql_db.table;

import lombok.Getter;

import java.util.Date;

@Getter
public class IExerciseDto {
    private Long ie_num;
    private String ie_name;
    private String ie_sec;
    private String ie_desc;
    private String ie_image;
    private String ie_part;
}
