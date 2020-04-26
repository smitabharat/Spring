package com.hefshine.bean;

public class Employee {
private int id;
private String name;
private Address address;
private Date date;

public Employee()
{
	
}

public Employee(int id, String name, Address address, Date date) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.date = date;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", date=" + date + "]";
}






}
