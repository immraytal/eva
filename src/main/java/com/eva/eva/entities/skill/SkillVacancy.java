package com.eva.eva.entities.skill;

import com.eva.eva.entities.Vacancy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SkillVacancy")
@Table(name = "skill_vacancy")
public class SkillVacancy {

    @EmbeddedId
    private SkillVacancyId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("vacancyId")
    @JoinColumn(name = "vacancy_id")
    @JsonIgnoreProperties(value = "skills")
    private Vacancy vacancy;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("skillId")
    @JoinColumn(name = "skill_id")
    @JsonIgnoreProperties(value = "vacancies")
    private Skill skill;

    @Column(name = "vac_level")
    private int level;

}
