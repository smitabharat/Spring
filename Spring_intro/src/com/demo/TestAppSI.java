package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Student;

public class TestAppSI {

	public static void main(String[] args) 
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Student student=(Student)context.getBean("s2");
		System.out.println(student);

	}

}
