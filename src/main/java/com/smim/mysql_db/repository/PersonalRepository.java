package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepository extends JpaRepository<Personal, Long> {
}
