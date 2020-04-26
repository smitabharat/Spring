package com.hefshine.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

public class TestMapper {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		StudentDAO sd=(StudentDAO)context.getBean("sd");
		
		Student student=sd.getById(1);
		System.out.println(student);

	}

}
