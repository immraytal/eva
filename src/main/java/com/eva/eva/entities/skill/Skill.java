package com.eva.eva.entities.skill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "skill")
@Entity(name = "skill")
public class Skill {

    @Id
    @GeneratedValue
    private int id;


    @Column(name = "skill_name")
    private String name;
}
