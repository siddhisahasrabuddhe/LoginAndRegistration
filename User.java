package com.fujitsu.loginandRegister.model;

public class User {
int id ;
String username, password, address,phoneNo;
public User(int id, String phoneNo2, String username, String password, String address) {
	super();
	this.id = id;
	this.phoneNo = phoneNo2;
	this.username = username;
	this.password = password;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [id=" + id + ", phoneNo=" + phoneNo + ", username=" + username + ", password=" + password
			+ ", address=" + address + "]";
}


}
