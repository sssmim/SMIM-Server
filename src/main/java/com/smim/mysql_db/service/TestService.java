package com.smim.mysql_db.service;

import com.smim.mysql_db.repository.TestRepository;
import com.smim.mysql_db.table.Test;
import com.smim.mysql_db.table.TestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class TestService {

    private final TestRepository testRepository;

    @Transactional
    public Long update(Long test_num, TestDto testDto) {
        Test test1 = testRepository.findById(test_num).orElseThrow(
                () -> new IllegalArgumentException("해당 그룹 번호가 존재하지 않습니다.")
        );
        test1.update(testDto);
        return test1.getTest_num();
    }
}