package com.onebill.corejava.basics;

import static java.lang.Math.*;
import static java.lang.System.*;

import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double temp,r1,r2;
		Scanner sc=new Scanner(in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();
		temp=pow(b,2)-(4*a*c);
		temp=sqrt(temp);
		r1=(-b+temp)/(2*a);
		r2=(-b-temp)/(2*a);
		System.out.println("The roots are: "+ r1 +" "+r2);
		sc.close();
	}

}
