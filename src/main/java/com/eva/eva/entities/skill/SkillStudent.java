package com.eva.eva.entities.skill;


import com.eva.eva.entities.Student;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity(name = "SkillStudent")
@Table(name = "skill_student")
public class SkillStudent {

    @EmbeddedId
    private SkillStudentId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("studentId")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("skillId")
    private Skill skill;

    @Column(name = "vac_level")
    private int level;
}
