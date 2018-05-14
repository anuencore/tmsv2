package com.encoress.tms.repository;

import org.springframework.stereotype.Repository;

import com.encoress.tms.domain.entity.Person;
import com.encoress.tms.repository.base.BaseRepository;

@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {
	
}
