package com.hefshine.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Address address=context.getBean("address",Address.class);
		Person person=context.getBean("person",Person.class);
		address.setCity("pune");
		address.setPin(1234);
		System.out.println(address);
		person.setName("smita");
		System.out.println(person);
	}

}
