package com.smim.mysql_db.table;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public class CommentDto {
    private Long comment_id;
    private Long p_num;
    private Long board_num;
    private String sub;
}
