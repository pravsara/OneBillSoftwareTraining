package com.onebill.corejava.basics.Assignment26;

import java.util.Scanner;

class WeightException extends Exception {
	public WeightException() {
		super("Weight less than 35 cannot be registered");
	}
}
class AgeException extends Exception {
	public AgeException() {
		super("Age less than 12 cannot be registered");
	}
}
class Details {
	int rollno;
	String name;
	int age;
	int weight;
	public Details(int rollno, String name, int age, int weight) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void display() {
		System.out.println("Student RollNo: "+rollno);
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
		System.out.println("Student Weight: "+weight);
	}
}
public class StudentRegistration {
	public static void main(String[] args) {
		Details stu[] = new Details[10];
		int inp;
		int rollno;
		String name;
		int age;
		int weight;
		int top=-1;//Last index , student details entered
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Adding Student Details\n2.View Student Details\n3.Exit"
					+ "\nEnter your choice");
			inp = sc.nextInt();
			if(inp == 1) {
				if(top == 10) {
					System.out.println("List is full");
				}
				else {
					try {
						top++;
						System.out.println("Enter Student's RollNo: ");
						rollno = sc.nextInt();
						System.out.println("Enter Student's Name: ");
						name = sc.next();
						System.out.println("Enter Student's age: ");
						age = sc.nextInt();
						System.out.println("Enter Student's weight: ");
						weight = sc.nextInt();
						if (age < 12) {
							throw new AgeException();
						} else if (weight < 35) {
							throw new WeightException();
						} else {
							stu[top] = new Details(rollno, name, age, weight);
							System.out.println("Added Successfully");
						}
					} catch (Exception e) {
						System.out.println("Error Occured : " + e.getMessage());
					}
				}
			}
			else if(inp == 2) {
				if(top==-1) {
					System.out.println("Nothing is Present");
				}
				for(int i=0; i<=top; i++) {
					stu[i].display();
				}
			}
			else if(inp == 3) {
				
			}
			else {
				System.out.println("Invalid input");
			}
		}while (inp!=3);
		System.out.println("End");		
	}
}
