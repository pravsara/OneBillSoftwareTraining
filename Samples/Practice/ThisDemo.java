package com.onebill.corejava.basics;

class Student{
	int rollno;
	String name;
	float fees;
	public Student(int rollno,String name,float fees) {
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fees);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student S1=new Student(111,"Praveen",2000f);
		S1.display();
	}

}
