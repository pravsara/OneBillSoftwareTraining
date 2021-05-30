package com.onebill.corejava.basics.map;

interface MyInterface {
	void show();
}


public class LambdaDemo {

	public static void main(String[] args) {
		
		MyInterface ref = () -> {System.out.println("Inside show method...");};

		ref.show();
	}

}
