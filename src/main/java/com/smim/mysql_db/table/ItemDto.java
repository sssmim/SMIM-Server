package com.smim.mysql_db.table;

import lombok.Getter;


@Getter
public class ItemDto {
    private Integer item_num;
    private String item_sort;
    private String item_name;
    private Integer item_price;
    private String item_img;
}
