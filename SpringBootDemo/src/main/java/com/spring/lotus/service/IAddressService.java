package com.spring.lotus.service;

import java.util.List;

import com.spring.lotus.entity.Address;

public interface IAddressService {

	List<Address> getAllAddress();
	Address getAddressById(Integer id);
	void addAddress(Address a);
	void deleteAddress(Integer id);
	void updateAddress(Integer id, Address a);
}
