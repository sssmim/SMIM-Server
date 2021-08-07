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
    private int count1;
    private String name2;
    private int count2;
    private String name3;
    private int count3;
    private String name4;
    private int count4;
    private String name5;
    private int count5;
}
