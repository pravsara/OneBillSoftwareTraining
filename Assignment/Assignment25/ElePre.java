package com.onebill.corejava.basics.Assignment25;

import java.util.Scanner;

public class ElePre {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int value;
		System.out.println("Enter a value to check: ");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		for(int i:arr) {
			if(i==value) {
				System.out.println("The value is Present");
				System.exit(0);
			}
		}
		System.out.println("The value is not Present");
		sc.close();
	}

}
