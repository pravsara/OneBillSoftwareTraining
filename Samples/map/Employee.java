package com.onebill.corejava.basics.map;

public class Employee {
	
	int empid;
	String empname;
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	
	

}