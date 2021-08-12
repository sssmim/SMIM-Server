package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class GExercise {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long ge_num;

    @Column(nullable = false)
    private String ge_name;

    @Column(nullable = true)
    private String ge_desc;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ge_date;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date ge_start_time;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date ge_end_time;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date ge_run_time;

    @Column(nullable = false)
    private String video_url;
}
