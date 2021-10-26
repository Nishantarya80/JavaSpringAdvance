package com.nishant.spring.springcoreadvance.stereotype.anotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nishant/spring/springcoreadvance/stereotype/anotations/config.xml");
		teacher bean = (teacher) ctx.getBean("inst");
		System.out.println(bean.hashCode());
		
		teacher bean2 = (teacher) ctx.getBean("inst");
		System.out.println(bean2.hashCode());
		
		teacher bean3 = (teacher) ctx.getBean("inst");
		System.out.println(bean3);
		
	}
	
}
