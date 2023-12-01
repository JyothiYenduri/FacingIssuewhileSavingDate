package com.example.PracticeOnDate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PracticeOnDate.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
