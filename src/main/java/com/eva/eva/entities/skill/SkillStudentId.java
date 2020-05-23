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
public class SkillStudentId implements Serializable {

    @Column(name = "student_id")
    private int studentId;

    @Column(name = "skill_id")
    private int skillId;

}
