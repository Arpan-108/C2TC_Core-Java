package com.spring.lotus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.lotus.entity.Product;

//Integer-datatype of Primary key ; Product-table class

public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	
}
