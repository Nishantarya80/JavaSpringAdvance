package com.nishant.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderDAOImpl2 implements orderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside DAO OrderDAOImpl2");

	}

}
