package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Test {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long test_num;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String pwd;

    public Test(TestDto testDto) {
        this.id = testDto.getId();
        this.pwd = testDto.getPwd();
    }

    public void update(TestDto testDto) {
        this.id = testDto.getId();
        this.pwd = testDto.getPwd();
    }
}

