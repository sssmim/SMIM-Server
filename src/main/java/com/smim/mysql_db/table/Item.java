package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Item {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer item_num;

    @Column(nullable = false)
    private String item_sort;

    @Column(nullable = false)
    private String item_name;

    @Column(nullable = false)
    private Integer item_price;

    @Column(nullable = false)
    private String item_img;


    public Item(ItemDto itemDto) {

        this.item_sort = itemDto.getItem_sort();
        this.item_name = itemDto.getItem_name();
        this.item_price = itemDto.getItem_price();
        this.item_img = itemDto.getItem_img();
    }

    public void update(ItemDto itemDto) {
        this.item_sort = itemDto.getItem_sort();
        this.item_name = itemDto.getItem_name();
        this.item_price = itemDto.getItem_price();
        this.item_img = itemDto.getItem_img();
    }
}

