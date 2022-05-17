package com.jobiak.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	      //context.registerShutdownHook();
		System.out.println(context.containsBean("emp"));
		Employee ref=(Employee) context.getBean("emp");
		System.out.println(ref);
	}

}
