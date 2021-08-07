package com.smim.mysql_db.controller;

import com.smim.mysql_db.repository.*;
import com.smim.mysql_db.service.GExerciseService;
import com.smim.mysql_db.service.IExerciseService;
import com.smim.mysql_db.service.OrganizationService;
import com.smim.mysql_db.service.TestService;
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

    private final TestRepository testRepository;

    private final TestService testService;

    private final GExerciseRepository gExerciseRepository;

    private final GExerciseService gExerciseService;

    private final IExerciseRepository iExerciseRepository;

    private final IExerciseService iExerciseService;

    private final VideoRepository videoRepository;

    private final IElistRepository ielistRepository;

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

    @GetMapping("/test")
    public List<Test> getTest() {
        return testRepository.findAll();
    }

    @PostMapping("/test")
    public Test createTest(@RequestBody TestDto testDto) {
        Test test = new Test(testDto);
        return testRepository.save(test);
    }

    @PutMapping("/test/{test_num}")
    public Long updateTest(@PathVariable Long test_num, @RequestBody TestDto testDto) {
        return testService.update(test_num, testDto);
    }

    @DeleteMapping("/test/{test_num}")
    public Long deleteTest(@PathVariable Long test_num) {
        testRepository.deleteById(test_num);
        return test_num;
    }

    @GetMapping("/gexercise")
    public List<GExercise> getGExercise() {
        return  gExerciseRepository.findAll();
    }

    @PostMapping("/gexercise")
    public GExercise createGExercise(@RequestBody GExerciseDto gexerciseDto) {
        GExercise gexercise = new GExercise(gexerciseDto);
        return gExerciseRepository.save(gexercise);
    }

    @PutMapping("/gexercise/{ge_num}")
    public Long updateGExercise(@PathVariable Long ge_num, @RequestBody GExerciseDto gexerciseDto) {
        return gExerciseService.update(ge_num, gexerciseDto);
    }

    @DeleteMapping("/gexercise/{ge_num}")
    public Long deleteGExercise(@PathVariable Long ge_num) {
        gExerciseRepository.deleteById(ge_num);
        return ge_num;
    }

    @GetMapping("/iexercise")
    public List<IExercise> getIExercise() {
        return  iExerciseRepository.findAll();
    }

    @PostMapping("/iexercise")
    public IExercise createIExercise(@RequestBody IExerciseDto iexerciseDto) {
        IExercise iexercise = new IExercise(iexerciseDto);
        return iExerciseRepository.save(iexercise);
    }

    @PutMapping("/iexercise/{ie_num}")
    public Long updateIExercise(@PathVariable Long ie_num, @RequestBody IExerciseDto iexerciseDto) {
        return iExerciseService.update(ie_num, iexerciseDto);
    }

    @DeleteMapping("/iexercise/{ie_num}")
    public Long deleteIExercise(@PathVariable Long ie_num) {
        iExerciseRepository.deleteById(ie_num);
        return ie_num;
    }

    @GetMapping("/list")
    public List<IElist> getList() {
        return ielistRepository.findAll();
    }

    @GetMapping("/video")
    public List<Video> getVideo() {
        return videoRepository.findAll();
    }
}
