package com.nishant.spring.springcoreadvance.autowiring.anotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired(required = false)
	@Qualifier("address123")
	private Address address;
	
	//@Autowired
	public Employee(Address address) {
		this.address =address;
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [ address=" + getAddress() + "]";
		}


}
