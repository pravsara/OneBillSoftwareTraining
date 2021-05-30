package com.onebill.corejava.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char gender = sc.next().charAt(0);
		int age= sc.nextInt();
		long mobileno = sc.nextLong();
		double salary = sc.nextDouble();
		System.out.println(name+"\n"+gender+"\n"+age+"\n"+mobileno+"\n2"+salary);
		

	}

}
