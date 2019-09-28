package com.eva.eva.entities.skill;

import com.eva.eva.entities.Vacancy;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity(name = "SkillVacancy")
@Table(name = "skill_vacancy")
public class SkillVacancy {

    @EmbeddedId
    private SkillVacancyId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("vacancyId")
    private Vacancy vacancy;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("skillId")
    private Skill skill;

    @Column(name = "vac_level")
    private int level;

}
