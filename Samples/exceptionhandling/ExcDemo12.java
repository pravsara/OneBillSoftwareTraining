package com.onebill.corejava.basics.exceptionhandling;

class Custom extends Exception {
	public Custom(String str) {
		super(str);
	}
}
public class ExcDemo12 {

	public static void main(String[] args) {
		try {
			throw new Custom("Custom Exception");
		}catch (Custom e) {
			System.out.println("catch executed\nThe word is: "+e.getMessage());
		}

	}

}
