package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Comment {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long comment_id;

    @Column(nullable = false)
    private Long p_num;

    @Column(nullable = false)
    private Long board_num;

    @Column(nullable = false)
    private String sub;

    public Comment(CommentDto commentDto) {
        this.p_num = commentDto.getP_num();
        this.board_num = commentDto.getBoard_num();
        this.sub = commentDto.getSub();
    }

    public void update(CommentDto commentDto) {
        this.p_num = commentDto.getP_num();
        this.board_num = commentDto.getBoard_num();
        this.sub = commentDto.getSub();
    }
}
