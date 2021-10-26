package com.nishant.spring.springcoreadvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrderBoImpl implements orderBO {
	
	private orderDAO dao; 
	
	@Override
	public void placeOrder(){
		System.out.println("inside oder BO");
		dao.createOrder();
	}

	public orderDAO getDao() {
		return dao;
	}

	public void setDao(orderDAO dao) {
		this.dao = dao;
	}

}
