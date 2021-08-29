package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class GExercise {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long ge_num;

    @Column(nullable = true)
    private String ge_desc;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ge_date;

    @Column(nullable = false)
    private LocalTime ge_start_time;

    @Column(nullable = false)
    private LocalTime ge_end_time;

    @Column(nullable = false)
    private String video_url;

    @Column(nullable = false)
    private int group_num;

    public GExercise(GExerciseDto GExerciseDto) {
        this.ge_desc = GExerciseDto.getGe_desc();
        this.ge_date = GExerciseDto.getGe_date();
        this.ge_start_time = GExerciseDto.getGe_start_time();
        this.ge_end_time = GExerciseDto.getGe_end_time();
        this.video_url = GExerciseDto.getVideo_url();
        this.group_num = GExerciseDto.getGroup_num();
    }

    public void update(GExerciseDto GExerciseDto) {
        this.ge_desc = GExerciseDto.getGe_desc();
        this.ge_date = GExerciseDto.getGe_date();
        this.ge_start_time = GExerciseDto.getGe_start_time();
        this.ge_end_time = GExerciseDto.getGe_end_time();
        this.video_url = GExerciseDto.getVideo_url();
        this.group_num = GExerciseDto.getGroup_num();
    }
}
