package com.encoress.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.encoress.tms.domain.entity.Person;
import com.encoress.tms.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@RequestMapping("/persons")
	@ResponseBody
	public List<Person> persons(){
		return service.getAllPersons();
	}
	
}
