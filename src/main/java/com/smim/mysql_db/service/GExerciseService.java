package com.smim.mysql_db.service;

import com.smim.mysql_db.repository.GExerciseRepository;
import com.smim.mysql_db.table.GExercise;
import com.smim.mysql_db.table.GExerciseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class GExerciseService {
    private final GExerciseRepository GExerciseRepository;

    @Transactional
    public Long update(Long ge_num, GExerciseDto gExerciseDto) {
        GExercise gexercise1 = GExerciseRepository.findById(ge_num).orElseThrow(
                () -> new IllegalArgumentException("해당 그룹 번호가 존재하지 않습니다.")
        );
        gexercise1.update(gExerciseDto);
        return gexercise1.getGe_num();
    }
}
