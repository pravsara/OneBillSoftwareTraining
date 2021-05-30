package com.onebill.corejava.basics.Assignment27;

import java.io.FileInputStream;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable {

	int reg_no;
	String name;

	public Student(int reg_no, String name) {
		super();
		this.reg_no = reg_no;
		this.name = name;
	}

}

public class SerializationDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Serialization: ");
		Student s1 = new Student(111, "Praveen");
		FileOutputStream fout = new FileOutputStream("text.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fout);
		obj.writeObject(s1); 
		obj.flush(); 
		obj.close();
		System.out.println("Success!");
		
		
		System.out.println("Deserialization");
		FileInputStream fin = new FileInputStream("text.txt");
		ObjectInputStream obj1 = new ObjectInputStream(fin);
		Student s2 = (Student) obj1.readObject();
		System.out.println("Student data : \n Reg_no : " + s2.reg_no + " Name : " + s2.name);
		fin.close();
		System.out.println("Success!");

	}

}


