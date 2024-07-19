package com.spring.lotus.service;

import java.util.List;

import com.spring.lotus.entity.Person;

public interface IPersonService {

	List<Person> getAllPersons();
	Person getPersonById(Integer id);
	void addPerson(Person p);
	void deletePerson(Integer id);
	void updatePerson(Integer id, Person p);
}
