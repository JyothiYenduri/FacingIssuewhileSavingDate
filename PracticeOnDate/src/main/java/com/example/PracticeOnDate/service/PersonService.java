package com.example.PracticeOnDate.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PracticeOnDate.entity.Person;
import com.example.PracticeOnDate.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	public Person savePerson(Person person) {
		// TODO Auto-generated method stub
		person.setDob(LocalDateTime.now());
		return personRepository.save(person);
	}

}
