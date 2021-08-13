package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Personal;
import com.smim.mysql_db.table.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
