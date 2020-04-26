package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

public class Test {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		StudentDAO sd=(StudentDAO)context.getBean("sd");
		
		//String name=sd.getName(1);
		//System.out.println(name);
		
		Student student=new Student(1,"kirti","Bharati");
		sd.save(student);
		
		System.out.println("save successful");

	}
	
	
}
