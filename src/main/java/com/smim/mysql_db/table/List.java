package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class List {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long list_num;

    @Column(nullable = false)
    private int list_order;

    @JoinColumn(name = "ie_num")
    private Long ie_num;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date ie_sec;

    @Column(nullable = false)
    private int list_ie_count;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date ie_run_time;
}
