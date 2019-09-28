package com.eva.eva.repositoryes;

import com.eva.eva.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {

}
