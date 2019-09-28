package com.eva.eva.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "faculty")
public class Faculty {

    @Id
    @GeneratedValue
    private int id;

   @JoinColumn(name = "university_id")
    private int university_id;

   @Column(name = "faculty_name")
    private String name;
}
