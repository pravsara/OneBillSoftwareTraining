package com.onebill.corejava.basics.Day5;

public class StaticBlockDemo {
	
	static {
		//mostly used for static data member initialization
		System.out.println("Invoking static block");
		//System.exit(0);
	}

	public static void main(String[] args) {
		
		System.out.println("invoking main method");
	}

}
