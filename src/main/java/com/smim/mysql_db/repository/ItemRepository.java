package com.smim.mysql_db.repository;

import com.smim.mysql_db.table.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
