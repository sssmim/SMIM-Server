package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Board {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long board_id;

    @Column(nullable = false)
    private Long group_num;

    @Column(nullable = false)
    private Long p_num;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String main;

    public Board(BoardDto boardDto) {
        this.group_num = boardDto.getGroup_num();
        this.p_num = boardDto.getP_num();
        this.title = boardDto.getTitle();
        this.main = boardDto.getMain();
    }

    public void update(BoardDto boardDto) {
        this.group_num = boardDto.getGroup_num();
        this.p_num = boardDto.getP_num();
        this.title = boardDto.getTitle();
        this.main = boardDto.getMain();
    }
}
