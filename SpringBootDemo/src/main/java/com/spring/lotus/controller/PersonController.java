package com.spring.lotus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.lotus.entity.Person;
import com.spring.lotus.entity.Product;
import com.spring.lotus.service.PersonService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class PersonController {
	
	@Autowired
	PersonService service;
	
	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		
		return service.getAllPersons();
	}
	
	@GetMapping("/person/{id}")
	public ResponseEntity<Person> getPerson(@PathVariable Integer id) {
		
		return new ResponseEntity<Person>(service.getPersonById(id), HttpStatus.OK);
	}
	
	@PostMapping("/persons")
	public void add(@RequestBody Person p) {
		
		service.addPerson(p);
	}
	
	@DeleteMapping("/person/{id}")
	public void delete(@PathVariable Integer id) {
		
		service.deletePerson(id);
	}
	
	@PutMapping("/person/{id}")
	public void update(@PathVariable Integer id, @RequestBody Person p) {
		
		service.updatePerson(id, p);
	}
}
