package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Reservation {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long rnum;

    @Column(nullable = false)
    private Long pnum;

    @Column(nullable = false)
    private Long gnum;



    public Reservation(ReservationDto reservationDto) {
        this.pnum = reservationDto.getPnum();
        this.gnum = reservationDto.getGnum();

    }

    public void update(ReservationDto reservationDto) {
        this.pnum = reservationDto.getPnum();
        this.gnum = reservationDto.getGnum();

    }
}
