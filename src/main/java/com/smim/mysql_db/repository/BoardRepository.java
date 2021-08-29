package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
