package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.IEtime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtimeRepository extends JpaRepository<IEtime, Long> {
}