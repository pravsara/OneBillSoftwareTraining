package com.onebill.corejava.basics;

public class ShortCircuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(false&&true&&true) {
			System.out.println("This will not be printed");
		} else {
			System.out.println("This will be printed bcos of short circuit &&operator");
		}
		if(true||false||false) {
			System.out.println("yes");
		}

	}

}
