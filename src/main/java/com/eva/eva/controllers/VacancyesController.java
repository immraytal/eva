package com.eva.eva.controllers;

import com.eva.eva.entities.Student;
import com.eva.eva.entities.Vacancy;
import com.eva.eva.entities.skill.Skill;
import com.eva.eva.repositoryes.StudentRepository;
import com.eva.eva.repositoryes.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping({"/vac"})
public class VacancyesController  {

    @Autowired
    VacancyRepository vacancyRepository;

    @GetMapping
    @ResponseBody
    public List<Vacancy> getVacancy(){
    List<Vacancy> vacancy = new ArrayList<>();

    return StreamSupport.stream(
            vacancyRepository.findAll().spliterator(), false)
            .collect(Collectors.toList());
    }
}
