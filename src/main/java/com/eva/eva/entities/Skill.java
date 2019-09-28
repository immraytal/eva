package com.eva.eva.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "skill")
public class Skill {

    @GeneratedValue
    @Id
    @Column(name = "skill_id")
    private int id;

    @Column(name = "skill_name")
    private String name;
}
