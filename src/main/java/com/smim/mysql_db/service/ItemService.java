package com.smim.mysql_db.service;

import com.smim.mysql_db.repository.ItemRepository;
import com.smim.mysql_db.table.*;
import com.smim.mysql_db.table.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@RequiredArgsConstructor
@Service
public class ItemService {
    private final com.smim.mysql_db.repository.ItemRepository ItemRepository;

    @Transactional
    public Integer update(Integer item_num, ItemDto itemDto) {
        Item item = ItemRepository.findById(item_num).orElseThrow(
                () -> new IllegalArgumentException("해당 번호가 존재하지 않습니다.")
        );
        item.update(itemDto);
        return item.getItem_num();
    }
}
