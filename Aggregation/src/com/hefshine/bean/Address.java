package com.hefshine.bean;

public class Address 
{
	private int pin;
	private String city;
	
	Address ()
	{
		
	}
	Address (int pin ,String city)
	{
		this.pin=pin;
		this.city=city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
}
