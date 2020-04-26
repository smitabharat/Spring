package com.hefshine.bean;

public class Date
{
private int birthdate,joiningdate;

public Date(int birthdate, int joiningdate) 
{
	super();
	this.birthdate = birthdate;
	this.joiningdate = joiningdate;
}

public int getBirthdate() {
	return birthdate;
}

public void setBirthdate(int birthdate) {
	this.birthdate = birthdate;
}

public int getJoiningdate() {
	return joiningdate;
}

public void setJoiningdate(int joiningdate) {
	this.joiningdate = joiningdate;
}

@Override
public String toString() {
	return "Date [birthdate=" + birthdate + ", joiningdate=" + joiningdate + "]";
}


}
