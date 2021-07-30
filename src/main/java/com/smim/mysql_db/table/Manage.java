package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Manage {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long manage_num;

    @JoinColumn(name = "group_num")
    private Long group_num;

    @JoinColumn(name = "mem_num")
    private Long mem_num;

    @Column(nullable = false)
    private int group_mem_count;
}
