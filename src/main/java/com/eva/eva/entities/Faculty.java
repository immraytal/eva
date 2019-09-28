package com.eva.eva.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Data
@AllArgsConstructor
public class Faculty {

   @JoinColumn(name = "university_id")
    private int university_id;

   @Column(name = "faculty_name")
    private String name;
}
