package com.hefshine.bean;

import org.springframework.stereotype.Component;

@Component

public class Person {
	String name;

	Person()
	{
		
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	

}
