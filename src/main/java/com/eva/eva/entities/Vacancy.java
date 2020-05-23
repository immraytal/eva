package com.eva.eva.entities;

import com.eva.eva.entities.skill.Skill;
import com.eva.eva.entities.skill.SkillVacancy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vacancy")
@Entity
public class Vacancy {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "vacancy_name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(
            mappedBy = "vacancy",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<SkillVacancy> skills = new ArrayList<>();

}
