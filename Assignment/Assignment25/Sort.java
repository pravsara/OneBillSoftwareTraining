package com.onebill.corejava.basics.Assignment25;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int arr[] = {1,5,2,3,8,7,9,4,6,10};
		System.out.println("Before Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nAfter Sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		String str[] = {"hi", "hello" , "welcome"};
		System.out.println("Before Sorting");
		for(String i:str) {
			System.out.print(i+" ");
		}
		Arrays.sort(str);
		System.out.println("\nAfter Sorting");
		for(String i:str) {
			System.out.print(i+" ");
		}
	}

}
