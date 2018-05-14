package com.encoress.tms.service;

import java.util.List;

import com.encoress.tms.domain.entity.Person;
import com.encoress.tms.repository.PersonRepository;

public interface PersonService {

	public List<Person> getAllPersons();

	public Person getPersonById(Long id);
	
	public void addPerson(Person person);

	public void removePersonById(Long id);
	
	
}
