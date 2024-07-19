package com.spring.lotus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.lotus.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
