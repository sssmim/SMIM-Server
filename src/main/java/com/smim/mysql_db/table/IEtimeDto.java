package com.smim.mysql_db.table;

import lombok.Getter;

import java.time.LocalTime;
import java.util.Date;

@Getter
public class IEtimeDto {
    private Long iet_num;
    private Long p_num;
    private Date daily_record;
    private LocalTime daily_total;
}
