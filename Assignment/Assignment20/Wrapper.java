package com.onebill.corejava.basics;
import java.util.*;
public class Wrapper { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primi;
		Integer nonprimi;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Primitive Value:(int)");
			primi=sc.nextInt();
			nonprimi=primi;
			System.out.println("After Autoboxing:"+nonprimi);
			primi=nonprimi;
			System.out.println("After Unboxing:"+primi);
			String primi1;
			System.out.println("Enter non Primitive value---- to int:");
			primi1=sc.next();
			int a=Integer.valueOf(primi1);
			System.out.println("After Unboxing:"+a);
		}
	}

}
