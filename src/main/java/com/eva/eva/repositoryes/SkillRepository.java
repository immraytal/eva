package com.eva.eva.repositoryes;

import com.eva.eva.entities.Student;
import com.eva.eva.entities.skill.Skill;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SkillRepository extends PagingAndSortingRepository<Skill, Integer> {

}
