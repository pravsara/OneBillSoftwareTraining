package com.onebill.corejava.basics.Assignment29;

public class Student {
	
	Integer id;
	String name;
	Integer age;
	Integer marks;
	public Student(Integer id, String name, Integer age, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	

}
