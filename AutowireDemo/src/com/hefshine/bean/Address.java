package com.hefshine.bean;

public class Address {
private String city,pin;
	
	Address()
	{
		System.out.println("default constructor");
	}
	

	public Address(String city, String pin) {
		super();
		this.city = city;
		this.pin = pin;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	

}
