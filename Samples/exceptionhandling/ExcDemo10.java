package com.onebill.corejava.basics.exceptionhandling;

public class ExcDemo10 {

	public static void main(String[] args) {
		try {
			int quotient = 25/0;
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero");
		}finally {
			System.out.println("This will be printed for sure");
		}

	}

}
