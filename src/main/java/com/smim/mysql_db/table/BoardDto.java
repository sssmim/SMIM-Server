package com.smim.mysql_db.table;

import lombok.Getter;

@Getter
public class BoardDto {
    private Long board_id;
    private Long group_num;
    private Long p_num;
    private String title;
    private String main;
}
