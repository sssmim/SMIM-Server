package com.smim.mysql_db.service;

import com.smim.mysql_db.repository.IEtimeRepository;
import com.smim.mysql_db.table.IEtime;
import com.smim.mysql_db.table.IEtimeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class IEtimeService {

    private final IEtimeRepository ietimeRepository;

    @Transactional
    public Long update(Long iet_num, IEtimeDto ietimeDto) {
        IEtime ietime = ietimeRepository.findById(iet_num).orElseThrow(
                () -> new IllegalArgumentException("해당 번호가 존재하지 않습니다.")
        );
        ietime.update(ietimeDto);
        return ietime.getIet_num();
    }
}
