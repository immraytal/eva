package com.eva.eva.entities.skill;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @OneToMany(
            mappedBy = "skill",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<SkillVacancy> vacancies = new ArrayList<>();


}
