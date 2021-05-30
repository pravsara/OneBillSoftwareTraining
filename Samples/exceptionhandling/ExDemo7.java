package com.onebill.corejava.basics.exceptionhandling;

public class ExDemo7 {
	static void validate(int age) {
		if(age <18) {
			throw new ArithmeticException("Age not valid");
		}
		else
			System.out.println("Welcome to cast your vote!");
	}

	public static void main(String[] args) {
		try {
			validate(13);
		}catch(ArithmeticException e)
		{
			System.out.println("Other business logic...");
		}

	}

}
