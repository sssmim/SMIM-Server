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

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date daily_record;

    @Temporal(TemporalType.TIME)
    private Date daily_total;
}
