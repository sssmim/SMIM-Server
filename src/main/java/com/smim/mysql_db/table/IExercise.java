package com.smim.mysql_db.table;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class IExercise {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long ie_num;

    @Column(nullable = false)
    private String ie_name;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Date ie_sec;

    @Column(nullable = false)
    private String ie_dsec;

    public IExercise(IExerciseDto IExerciseDto) {
        this.ie_num = IExerciseDto.getIe_num();
        this.ie_name = IExerciseDto.getIe_name();
        this.ie_sec = IExerciseDto.getIe_sec();
        this.ie_dsec = IExerciseDto.getIe_dsec();


    }

    public void update(IExerciseDto IExerciseDto) {
        this.ie_num = IExerciseDto.getIe_num();
        this.ie_name = IExerciseDto.getIe_name();
        this.ie_sec = IExerciseDto.getIe_sec();
        this.ie_dsec = IExerciseDto.getIe_dsec();
    }
}
