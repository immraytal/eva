package com.eva.eva.repositoryes;

import com.eva.eva.entities.Vacancy;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VacancyRepository extends PagingAndSortingRepository<Vacancy, Integer> {

}
