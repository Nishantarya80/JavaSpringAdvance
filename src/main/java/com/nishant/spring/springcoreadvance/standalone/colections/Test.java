package com.nishant.spring.springcoreadvance.standalone.colections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/springcoreadvance/standalone/colections/config.xml");
		productslist bean = (productslist) ctx.getBean("productslist");
		System.out.println(bean);
	}
}
