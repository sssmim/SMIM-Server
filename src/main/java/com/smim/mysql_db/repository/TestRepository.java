package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
