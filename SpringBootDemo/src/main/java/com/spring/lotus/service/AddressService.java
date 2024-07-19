package com.spring.lotus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.lotus.entity.Address;
import com.spring.lotus.repository.AddressRepository;

@Service
public class AddressService implements IAddressService {

	@Autowired
	AddressRepository repo;
	
	@Override
	public List<Address> getAllAddress() {
		
		List<Address> list = repo.findAll();
		return list;
	}

	@Override
	public Address getAddressById(Integer id) {
		
		Address obj=repo.findById(id).get();
		return obj;
	}

	@Override
	public void addAddress(Address a) {
		
		repo.save(a);		
	}

	@Override
	public void deleteAddress(Integer id) {
		
		repo.deleteById(id);
	}

	@Override
	public void updateAddress(Integer id, Address a) {
		
		if (repo.findById(id).isPresent()) {
			
			repo.save(a);
		} 
		System.out.println("Record not found");	
	}

}
