package com.nishant.spring.springcoreadvance.autowiring.anotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/springcoreadvance/autowiring/anotations/config.xml");
		Employee bean = (Employee) ctx.getBean("employee");
		System.out.println(bean);
	}
}
