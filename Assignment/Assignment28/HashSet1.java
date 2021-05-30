package com.onebill.corejava.basics.Assignment28;

import java.util.*;

public class HashSet1 {
	public static void main(String[] args) throws ClassCastException{
		
		
		HashSet<Student> stu = new HashSet<Student>();
		stu.add(new Student(101, "Praveen" , 50));
		stu.add(new Student(102, "Ragul" , 70));
		stu.add(new Student(103, "Mohan" , 90));
		//sorting done by marks
		System.out.println("Before : "+stu);
		
		
		
		
		
	}

}
