package com.smim.mysql_db.service;

import com.smim.mysql_db.repository.OrganizationRepository;
import com.smim.mysql_db.table.Organization;
import com.smim.mysql_db.table.OrganizationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Transactional
    public Long update(Long group_num, OrganizationDto organizationDto) {
        Organization organization1 = organizationRepository.findById(group_num).orElseThrow(
                () -> new IllegalArgumentException("해당 그룹 번호가 존재하지 않습니다.")
        );
        organization1.update(organizationDto);
        return organization1.getGroup_num();
    }
}
