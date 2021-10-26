package com.nishant.spring.springcoreadvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/springcoreadvance/injecting/interfaces/config.xml");
		orderBO bean = (orderBO)ctx.getBean("BO");
		bean.placeOrder();
		
		ApplicationContext ctx2 = new ClassPathXmlApplicationContext("com/nishant/spring/springcoreadvance/injecting/interfaces/config2.xml");
		orderBO bean2 = (orderBO)ctx.getBean("BO");
		bean2.placeOrder();

	}

}
