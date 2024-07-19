package com.spring.lotus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lotus.entity.Person;
import com.spring.lotus.repository.PersonRepository;

@Service
public class PersonService implements IPersonService {

	@Autowired
	PersonRepository repo;
	
	@Override
	public List<Person> getAllPersons() {
		
		return repo.findAll();
	}

	@Override
	public Person getPersonById(Integer id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void addPerson(Person p) {
		
		repo.save(p);
	}

	@Override
	public void deletePerson(Integer id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updatePerson(Integer id, Person p) {
		
		if (repo.findById(id).isPresent()) {
			
			repo.save(p);
		} 
		System.out.println("Record not found");	
	}

}
