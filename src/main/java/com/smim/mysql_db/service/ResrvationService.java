package com.smim.mysql_db.service;

import com.smim.mysql_db.repository.PersonalRepository;
import com.smim.mysql_db.repository.ReservationRepository;
import com.smim.mysql_db.table.Personal;
import com.smim.mysql_db.table.PersonalDto;
import com.smim.mysql_db.table.Reservation;
import com.smim.mysql_db.table.ReservationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ResrvationService {

    private final ReservationRepository reservationRepository;

    @Transactional
    public Long update(Long rnum, ReservationDto reservationDto) {
        Reservation reservation = reservationRepository.findById(rnum).orElseThrow(
                () -> new IllegalArgumentException("해당 멤버 번호가 존재하지 않습니다.")
        );
        reservation.update(reservationDto);
        return reservation.getRnum();
    }
}
