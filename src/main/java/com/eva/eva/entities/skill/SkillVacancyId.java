package com.eva.eva.entities.skill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkillVacancyId  implements Serializable {

    @Column(name = "vacancy_id")
    private int vacancyId;

    @Column(name = "skill_id")
    private int skillId;

}
