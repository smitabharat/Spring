package com.hefshine.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Address address=(Address)context.getBean("a");
		System.out.println(address);

	}

}
