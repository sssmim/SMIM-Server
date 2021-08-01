package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.IExercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExerciseRepository extends JpaRepository<IExercise, Long> {
}
