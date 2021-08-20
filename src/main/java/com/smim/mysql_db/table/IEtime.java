package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class IEtime {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long iet_num;

    @Column(nullable = false)
    private Long p_num;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date daily_record;

    @Column(nullable = true)
    private LocalTime daily_total;

    public IEtime(IEtimeDto ietimeDto) {
        this.p_num = ietimeDto.getP_num();
        this.daily_record = ietimeDto.getDaily_record();
        this.daily_total = ietimeDto.getDaily_total();
    }

    public void update(IEtimeDto ietimeDto) {
        this.p_num = ietimeDto.getP_num();
        this.daily_record = ietimeDto.getDaily_record();
        this.daily_total = ietimeDto.getDaily_total();
    }
}