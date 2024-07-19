package com.spring.lotus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.lotus.entity.Product;
import com.spring.lotus.service.ProductService;

import jakarta.websocket.server.PathParam;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/products")
	public List<Product> list() {
		
		return service.getAllProducts(); 
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) {
		
		try {
			
			Product product = service.getProductById(id); 
			return new ResponseEntity<Product>(product, HttpStatus.OK);
			
		} catch (Exception e) {

			return new ResponseEntity<Product> (HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product p) {
		
		service.addProduct(p);
	}
	
	@PutMapping("/product/{id}" )
	public ResponseEntity<Product> updateProduct(@RequestBody Product p, @PathVariable int id) {
		
		try {
			
			service.updateProduct(id, p);
			return new ResponseEntity<Product>(p, HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<Product> (HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/product/{id}")
	public void delete(@PathVariable int id) {
		
		Product p= service.getProductById(id);
		if(p!=null)
			service.deleteProduct(id);
	}
}
