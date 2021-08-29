package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
