package com.smim.mysql_db.service;

import com.smim.mysql_db.repository.IExerciseRepository;
import com.smim.mysql_db.table.*;
import com.smim.mysql_db.table.IExercise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@RequiredArgsConstructor
@Service
public class IExerciseService {
    private final com.smim.mysql_db.repository.IExerciseRepository IExerciseRepository;

    @Transactional
    public Long update(Long ie_num, IExerciseDto iExerciseDto) {
        IExercise iexercise = IExerciseRepository.findById(ie_num).orElseThrow(
                () -> new IllegalArgumentException("해당 그룹 번호가 존재하지 않습니다.")
        );
        iexercise.update(iExerciseDto);
        return iexercise.getIe_num();
    }
}
