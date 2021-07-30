package com.smim.mysql_db.controller;

import com.smim.mysql_db.repository.*;
import com.smim.mysql_db.table.GExercise;
import com.smim.mysql_db.table.IExercise;
import com.smim.mysql_db.table.Organization;
import com.smim.mysql_db.table.Personal;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TotalRestController {

    private final PersonalRepository personalRepository;

    private final OrganizationRepository organizationRepository;

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
