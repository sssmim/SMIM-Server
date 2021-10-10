package com.smim.mysql_db.table;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public class PersonalDto {
    private Long mem_num;
    private String id;
    private String pwd;
    private String name;
    private String interest;
    private Integer group_num;
    private Integer point;
    private Integer total_point;
    private String question;
    private String answer;
    private Integer grade;
}
