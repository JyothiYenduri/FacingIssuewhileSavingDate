package com.example.PracticeOnDate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PracticeOnDate.entity.Person;
import com.example.PracticeOnDate.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/saveperson")
	public ResponseEntity<Person> savePerson(@RequestBody Person person){
		return ResponseEntity.ok(personService.savePerson(person));
	}
}
