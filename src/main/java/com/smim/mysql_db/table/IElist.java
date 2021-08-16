package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class IElist {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long list_num;

    @Column(nullable = false)
    private String name1;

    @Column(nullable = false)
    private Integer count1;

    @Column
    private String name2;

    @Column
    private Integer count2;

    @Column
    private String name3;

    @Column
    private Integer count3;

    @Column
    private String name4;

    @Column
    private Integer count4;

    @Column
    private String name5;

    @Column
    private Integer count5;

    public IElist(IElistDto ielistDto) {
        this.name1 = ielistDto.getName1();
        this.count1 = ielistDto.getCount1();
        this.name2 = ielistDto.getName2();
        this.count2 = ielistDto.getCount2();
        this.name3 = ielistDto.getName3();
        this.count3 = ielistDto.getCount3();
        this.name4 = ielistDto.getName4();
        this.count4 = ielistDto.getCount4();
        this.name5 = ielistDto.getName5();
        this.count5 = ielistDto.getCount5();
    }
}
