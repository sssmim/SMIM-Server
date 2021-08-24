package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
