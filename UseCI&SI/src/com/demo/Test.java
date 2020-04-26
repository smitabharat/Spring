package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Connect;



public class Test {

	public static void main(String[] args) 
	{
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Connect connect=(Connect)context.getBean("s2");
		System.out.println(connect);

	}

}
