package com.jobiak.ioc;

public class Employee {
	int empid;
	String firstName;
	String lastName;
	String emploc;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String firstName, String lastName, String emploc) {
		
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emploc = emploc;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmploc() {
		return emploc;
	}
	public void setEmploc(String emploc) {
		this.emploc = emploc;
	}
	
	
}
