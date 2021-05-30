package com.onebill.corejava.basics.Day5;

class Employee {
	int empid;
	static String companyname = "OneBill";
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	
	void display() {
		System.out.println(empid+" "+companyname);
	}
}

public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(111);
		emp1.display();
		Employee.companyname = "TestYantra";
		emp1.display();
	}

}
