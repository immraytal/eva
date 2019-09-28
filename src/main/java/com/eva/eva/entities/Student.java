package com.eva.eva.entities;

import com.eva.eva.entities.skill.Skill;
import com.eva.eva.entities.skill.SkillStudent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Entity
public class Student {

    @Id
    @GeneratedValue
    private int id;

    private String login;

    @OneToMany(
            mappedBy = "student",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SkillStudent> skills = new ArrayList<>();
}
