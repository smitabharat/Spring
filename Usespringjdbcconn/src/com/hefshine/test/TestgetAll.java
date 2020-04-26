package com.hefshine.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hefshine.bean.Student;
import com.hefshine.dao.StudentDAO;

public class TestgetAll {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		StudentDAO sd=(StudentDAO)context.getBean("sd");
		
		List<Student>studentList=sd.getAll();
		for(Student student:studentList)
		{
			System.out.println(student);
		}

	}

}
