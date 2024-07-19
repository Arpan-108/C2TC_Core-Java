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

import com.spring.lotus.entity.Address;
import com.spring.lotus.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService service;
	
	@GetMapping("/addresses")
	public List<Address> getAllAddress() {
		
		return service.getAllAddress();
	}
	
	@GetMapping("/address/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable Integer id) {
		
		return new ResponseEntity<Address>(service.getAddressById(id), HttpStatus.OK);
	}
	
	@PostMapping("/addresses")
	public void add(@RequestBody Address p) {
		
		service.addAddress(p);
	}
	
	@DeleteMapping("/address/{id}")
	public void delete(@PathVariable Integer id) {
		
		service.deleteAddress(id);
	}
	
	@PutMapping("/address/{id}")
	public void update(@PathVariable Integer id, @RequestBody Address p) {
		
		service.updateAddress(id, p);
	}
}
