package com.onebill.corejava.basics.Day5;

interface MyInterface {
	void myMethod1();
	void myMethod2();
}

public class SimpleInterface implements MyInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface myInterface = new SimpleInterface();
		myInterface.myMethod1();
		myInterface.myMethod2();
		
	}

	public void myMethod1() {
		System.out.println("Implementation for myMethod1()");
	}
	public void myMethod2() {
		System.out.println("Implementation for myMethod2()");
	}
}
