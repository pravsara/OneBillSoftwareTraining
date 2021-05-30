package com.onebill.corejava.basics;

class Person{
	String name;
	int age;
	public Person() {
		name="null";
		age=0;
	}
	public Person(String name) {
		this.name=name;
		age=0;
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return "Person [name=" +name+",age="+age+"]";
	}
}
public class ThisDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person("Praveen");
		Person p3=new Person("Praveen",21);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}
}
