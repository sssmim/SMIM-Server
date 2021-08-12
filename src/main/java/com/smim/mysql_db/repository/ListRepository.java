package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<List, Long> {
}
