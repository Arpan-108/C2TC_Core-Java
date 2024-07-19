package com.spring.lotus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	Integer id;
	String city;
	String pinCode;
	
	public Address() {
	
	}

	public Address(Integer id, String city, String pinCode) {
		
		this.id = id;
		this.city = city;
		this.pinCode = pinCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}
