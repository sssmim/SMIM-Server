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

    @Column(nullable = false)
    private Integer point;

    @Column(nullable = false)
    private Integer total_point;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String answer;

    @Column(nullable = true)
    private Integer grade;

    public Personal(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.name = personalDto.getName();
        this.interest = personalDto.getInterest();
        this.group_num = personalDto.getGroup_num();
        this.point = personalDto.getPoint();
        this.total_point = personalDto.getTotal_point();
        this.question = personalDto.getQuestion();
        this.answer = personalDto.getAnswer();
        this.grade = personalDto.getGrade();
    }

    public void update(PersonalDto personalDto) {
        this.id = personalDto.getId();
        this.pwd = personalDto.getPwd();
        this.name = personalDto.getName();
        this.interest = personalDto.getInterest();
        this.group_num = personalDto.getGroup_num();
        this.point = personalDto.getPoint();
        this.total_point = personalDto.getTotal_point();
        this.question = personalDto.getQuestion();
        this.answer = personalDto.getAnswer();
        this.grade = personalDto.getGrade();
    }
}
