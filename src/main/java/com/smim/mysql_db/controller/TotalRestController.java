package com.smim.mysql_db.controller;

import com.smim.mysql_db.repository.*;
import com.smim.mysql_db.service.OrganizationService;
import com.smim.mysql_db.table.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TotalRestController {

    private final PersonalRepository personalRepository;

    private final OrganizationRepository organizationRepository;

    private final OrganizationService organizationService;

    private final GExerciseRepository gExerciseRepository;

    private final IExerciseRepository iExerciseRepository;

    private final ListRepository listRepository;

    @GetMapping("/personal")
    public List<Personal> getPersonal() {
        return personalRepository.findAll();
    }

    @GetMapping("/organization")
    public List<Organization> getOrganization() {
        return organizationRepository.findAll();
    }

    @PostMapping("/organization")
    public Organization createOrganization(@RequestBody OrganizationDto organizationDto) {
        Organization organization = new Organization(organizationDto);
        return organizationRepository.save(organization);
    }

    @PutMapping("/organization/{group_num}")
    public Long updateOrganization(@PathVariable Long group_num, @RequestBody OrganizationDto organizationDto) {
        return organizationService.update(group_num, organizationDto);
    }

    @DeleteMapping("/organization/{group_num}")
    public Long deleteOrganization(@PathVariable Long group_num) {
        organizationRepository.deleteById(group_num);
        return group_num;
    }

    @GetMapping("/gexercise")
    public List<GExercise> getGExercise() {
        return  gExerciseRepository.findAll();
    }

    @GetMapping("/iexercise")
    public List<IExercise> getIExercise() {
        return  iExerciseRepository.findAll();
    }

    @GetMapping("/list")
    public List<com.smim.mysql_db.table.List> getList() {
        return listRepository.findAll();
    }
}
