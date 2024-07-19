package com.spring.lotus.service;

import java.util.List;

import com.spring.lotus.entity.Product;

public interface IProductService {
	
	List<Product> getAllProducts();
	Product getProductById(int id);
	void addProduct(Product p);
	void deleteProduct(int id);
	void updateProduct(int id, Product p);
		
}
