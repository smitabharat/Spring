package com.hefshine.bean;

public class Student 
{
private String name;
private int rollNo;

Student()
{
	System.out.println("default constructor");
}

Student(String name,int rollNo)
{
	this.name=name;
	this.rollNo=rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	System.out.println("default constructor get");
	this.rollNo = rollNo;
}

@Override
public String toString() {
	return "Student [name=" + name + ", rollNo=" + rollNo + "]";
}

}
