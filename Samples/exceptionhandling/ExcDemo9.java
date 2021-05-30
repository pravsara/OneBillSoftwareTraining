package com.onebill.corejava.basics.exceptionhandling;

import java.io.IOException;

public class ExcDemo9 {

	public static char prompt(String str) throws IOException {
		System.out.println(str);
		return (char) System.in.read();

	}
	public static void main(String[] args) {
		char ch;
		try {
			ch = prompt("Enter a letter: ");
		} catch (IOException e) {
			System.out.println("IO Exception Occured");
			ch = 'x';
		}
		System.out.println("You have Entered "+ch);
	}
	

}
