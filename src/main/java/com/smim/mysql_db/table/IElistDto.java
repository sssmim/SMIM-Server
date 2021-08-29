package com.smim.mysql_db.table;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
public class IElistDto {
    private Long list_num;
    private String name1;
    private Integer count1;
    private String name2;
    private Integer count2;
    private String name3;
    private Integer count3;
    private String name4;
    private Integer count4;
    private String name5;
    private Integer count5;
}
