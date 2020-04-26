package com.hefshine.bean;

public class Student {
int Rollno;
String Firstname;
String Lastname;

public Student()
{
	
}

public Student(int rollno, String firstname, String lastname) {
	super();
	Rollno = rollno;
	Firstname = firstname;
	Lastname = lastname;
}

public int getRollno() {
	return Rollno;
}

public void setRollno(int rollno) {
	Rollno = rollno;
}

public String getFirstname() {
	
	
	return Firstname;
}

public void setFirstname(String firstname) {
	Firstname = firstname;
}

public String getLastname() {
	return Lastname;
}

public void setLastname(String lastname) {
	Lastname = lastname;
}

@Override
public String toString() {
	return "Student [Rollno=" + Rollno + ", Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
}

}
