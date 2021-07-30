package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Organization {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long group_num;

    @Column(nullable = false)
    private String group_name;

    @Column(nullable = true)
    private String group_desc;

    @Column(nullable = false)
    private String group_category;

    @Column(nullable = true)
    private String group_image;

    @Column(nullable = true)
    private int view_count;

    @Column(nullable = true)
    private int authority;
}
