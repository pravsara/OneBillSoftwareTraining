package com.onebill.corejava.basics.Assignment29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentSorting {

	public static void main(String[] args) {

		ArrayList<Student> stu = new ArrayList<Student>();

		int inp;

		Scanner sc = new Scanner(System.in);

		stu.add(new Student(101, "Arun", 20, 100));
		stu.add(new Student(103, "Praveen", 21, 99));
		stu.add(new Student(105, "Gugan", 22, 98));
		stu.add(new Student(107, "Ragul", 23, 97));
		stu.add(new Student(109, "Mohan", 24, 96));
		stu.add(new Student(102, "Gokul", 19, 95));
		stu.add(new Student(104, "Srinivas", 19, 94));
		stu.add(new Student(106, "Rohit", 20, 93));
		stu.add(new Student(108, "Rupa", 22, 92));
		stu.add(new Student(110, "Varshini", 21, 91));

		System.out.println("The datas are: ");

		Iterator<Student> itr = stu.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

		do {
			System.out.println("\n1. Sort by id\n2.Sort by age\n3.Sort by name\n4.Sort by marks\n5.Exit");
			inp = sc.nextInt();

			if (inp == 1) {
				Collections.sort(stu, new SortById());

				System.out.println();

				Iterator<Student> itr1 = stu.iterator();

				while (itr1.hasNext()) {
					System.out.println(itr1.next());				
				}
			} else if (inp == 2) {

				Collections.sort(stu, new SortByAge());

				System.out.println();

				Iterator<Student> itr1 = stu.iterator();

				while (itr1.hasNext()) {
					System.out.println(itr1.next());
				}
			} else if (inp == 3) {

				Collections.sort(stu, new SortByName());

				System.out.println();

				Iterator<Student> itr1 = stu.iterator();

				while (itr1.hasNext()) {
					System.out.println(itr1.next());					
				}
			} else if (inp == 4) {

				Collections.sort(stu, new SortByMarks());

				System.out.println();

				Iterator<Student> itr1 = stu.iterator();

				while (itr1.hasNext()) {
					System.out.println(itr1.next());
				}
			} else if (inp == 5)
				;
			else {
				System.out.println("Invalid Input");
			}

		} while (inp != 5);
		
		System.out.println("End");
		sc.close();

	}

}
