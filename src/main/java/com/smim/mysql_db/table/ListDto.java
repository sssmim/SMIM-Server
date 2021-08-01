package com.smim.mysql_db.table;

import lombok.Getter;

import java.util.Date;

@Getter
public class ListDto {
    private Long list_num;
    private int list_order;
    private Long ie_num;
    private int ie_count;
    private Date ie_run_time;
}
