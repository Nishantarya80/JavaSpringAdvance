package com.nishant.spring.springcoreadvance.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/springcoreadvance/autowiring/config.xml");
		Employee bean = (Employee) ctx.getBean("employee");
		System.out.println(bean);
	}
}
