package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Personal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long mem_num;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String pwd;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String interest;

    @Column(nullable = true)
    private Integer group_num;

    @Column(nullable = true)
    private Integer point;

    public Personal(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.name = personalDto.getName();
        this.interest = personalDto.getInterest();
        this.group_num = personalDto.getGroup_num();
        this.point = personalDto.getPoint();
    }

    public void update(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.name = personalDto.getName();
        this.interest = personalDto.getInterest();
        this.group_num = personalDto.getGroup_num();
        this.point = personalDto.getPoint();
    }
}
