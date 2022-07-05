package com.sushant.core_java_hands_on.oops;

public class Emp {
String ID;
String name;
String address;


public Emp() {
	super();
}

public Emp(String iD, String name, String address) {
	super();
	ID = iD;
	this.name = name;
	this.address = address;
}


public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


@Override
public String toString() {
	return "Emp [ID=" + ID + ", name=" + name + ", address=" + address + "]";
}

}
