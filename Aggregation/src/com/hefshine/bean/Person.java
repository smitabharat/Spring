package com.hefshine.bean;

public class Person 
{
private String name;
private int id;
private Address address;

Person()
{
	
}
Person(String name,int id,Address address)
{
	this.address=address;
	this.name=name;
	this.id=id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + ", address=" + address + "]";
}

}
