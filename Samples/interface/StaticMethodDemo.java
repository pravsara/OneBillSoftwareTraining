package com.onebill.corejava.basics.Day5;

class Employee1 {
	int empid;
	static String companyname = "OneBill";
	public Employee1(int empid) {
		super();
		this.empid = empid;
	}
	static void changeName() {
		companyname = "TestYantra";
	}
	
	void display() {
		System.out.println(empid+" "+companyname);
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee1 emp1 = new Employee1(111);
		emp1.display();
		Employee1.changeName();
		emp1.display();
	}

}
