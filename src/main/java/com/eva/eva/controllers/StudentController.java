package com.eva.eva.controllers;

import com.eva.eva.entities.Student;
import com.eva.eva.repositoryes.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping({"/std"})
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    @ResponseBody
    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();

        return StreamSupport.stream(
                studentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
