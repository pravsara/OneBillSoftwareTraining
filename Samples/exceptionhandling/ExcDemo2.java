package com.onebill.corejava.basics.exceptionhandling;

class ExceptionTest {
	static void generateException() {
		int[] numbers = new int[4];
		System.out.println("Before exception..");
		numbers[5] = 10;
		System.out.println("This won't be displayed");
	}
}
public class ExcDemo2 {

	public static void main(String[] args) {
		try {
			ExceptionTest.generateException();
		} catch(Exception e) { //for array index out of bound we cannot use other exception to catch
			System.out.println("Index out of bounds..");
		}
		System.out.println("Completed execution");
		System.out.println("Other business logic..");
	}

}
