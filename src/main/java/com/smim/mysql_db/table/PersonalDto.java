package com.smim.mysql_db.table;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public class PersonalDto {
    private Long mem_num;
    private String id;
    private String pwd;
    private String personal_image;
    private String interest;
    private String daily_record;
    private String daily_total;
    private Integer group_num;
}
