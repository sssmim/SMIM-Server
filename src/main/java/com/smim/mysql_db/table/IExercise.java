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
    private String ie_sec;

    @Column(nullable = false)
    private String ie_dsec;

    @Column(nullable = false)
    private String ie_part;

    @Column(nullable = true)
    private String ie_image;

    public IExercise(IExerciseDto iExerciseDto) {
        this.ie_name = iExerciseDto.getIe_name();
        this.ie_sec = iExerciseDto.getIe_sec();
        this.ie_dsec = iExerciseDto.getIe_desc();
        this.ie_image = iExerciseDto.getIe_image();
        this.ie_part = iExerciseDto.getIe_part();
    }

    public void update(IExerciseDto iExerciseDto) {
        this.ie_name = iExerciseDto.getIe_name();
        this.ie_sec = iExerciseDto.getIe_sec();
        this.ie_dsec = iExerciseDto.getIe_desc();
        this.ie_image = iExerciseDto.getIe_image();
        this.ie_part = iExerciseDto.getIe_part();
    }
}
