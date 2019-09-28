package com.eva.eva.controllers;

import com.eva.eva.entities.Student;
import com.eva.eva.entities.skill.Skill;
import com.eva.eva.repositoryes.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/vac"})
public class VacancyesController  {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public List<Student> getStudents(){
    List<Student> students = new ArrayList<>();

    return students;
    }
}
