package com.spring.lotus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.lotus.entity.Product;
import com.spring.lotus.repository.ProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	ProductRepository repo;
	
	@Override
	public List<Product> getAllProducts() {
		
		List<Product> prodList;
		prodList = repo.findAll();
		
		return prodList;
	}

	@Override
	public Product getProductById(@PathVariable int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public void addProduct(Product p) {
		
		repo.save(p);
		
	}

	@Override
	public void deleteProduct(int id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updateProduct(int id, Product p) {

		if (repo.findById(id).isPresent()) {
			
			repo.save(p);
		} 
		System.out.println("Record not found");	
	}

}
