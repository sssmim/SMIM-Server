package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Enroll {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long enroll_num;

    @JoinColumn(name = "group_num")
    private Long group_num;

    @JoinColumn(name = "ge_num")
    private Long ge_num;
}
