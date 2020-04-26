package com.hefshine.bean;

public class Connect 
{
private String username,password,url,driverclass;


Connect()
{
	
}
Connect(String username,String password,String url,String driverclass)
{
	this.username=username;
	this.password=password;
	this.url=url;
	this.driverclass=driverclass;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	System.out.println("setter injection called default constructor");
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getDriverclass() {
	return driverclass;
}
public void setDriverclass(String driverclass) {
	this.driverclass = driverclass;
}
@Override
public String toString() {
	return "Connect [username=" + username + ", password=" + password + ", url=" + url + ", driverclass=" + driverclass
			+ "]";
}

}