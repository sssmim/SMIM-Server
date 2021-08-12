package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class IExercise {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long ie_num;

    @Column(nullable = false)
    private String ie_name;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date ie_sec;

    @Column(nullable = false)
    private String ie_dsec;
}
