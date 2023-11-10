package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {

	private int id;
	private String name;
	private String mobnum;
//	default constructor
	public Employee() {
		super();
	}
	
//parameterized constructor
public Employee(int id, String name, String mobnum) {
	super();
	this.id = id;
	this.name = name;
	this.mobnum = mobnum;
}

public boolean equals(Object ob) {
	return id==((Employee)ob).id;
}
//getters and setters

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

public String getMobnum() {
	return mobnum;
}

public void setMobnum(String mobnum) {
	this.mobnum = mobnum;
}

//to sting method

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", mobnum=" + mobnum + "]";
}
	

}
