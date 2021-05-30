package com.onebill.corejava.basics.exceptionhandling;

public class ExcDemo1 {

	public static void main(String[] args) {
		int[] numbers = new int[4];
		try {
			System.out.println("Before...");
		
			numbers[5] = 10;
			System.out.println("After..");
		} catch(Exception e) {
			System.out.println("Index out of bounds error occured");
			e.printStackTrace();
		}
	}

}
