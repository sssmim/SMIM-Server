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

    @Column(nullable = true)
    private String personal_image;

    @Column(nullable = true)
    private String interest;

    @Column(nullable = true)
    private String daily_record;

    @Column(nullable = true)
    private String daily_total;

    @Column(nullable = true)
    private Integer group_num;

    public Personal(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.personal_image = personalDto.getPersonal_image();
        this.interest = personalDto.getInterest();
        this.daily_record = personalDto.getDaily_record();
        this.daily_total = personalDto.getDaily_total();
        this.group_num = personalDto.getGroup_num();
    }

    public void update(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.personal_image = personalDto.getPersonal_image();
        this.interest = personalDto.getInterest();
        this.daily_record = personalDto.getDaily_record();
        this.daily_total = personalDto.getDaily_total();
        this.group_num = personalDto.getGroup_num();
    }
}
