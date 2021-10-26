package com.nishant.spring.springcoreadvance.autowiring;

public class Employee {
	
	private Address address;
	
	public Employee(Address address) {
		this.address =address;
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [ address=" + getAddress() + "]";
	}


}
