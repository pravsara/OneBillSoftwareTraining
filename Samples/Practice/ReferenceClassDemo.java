package com.onebill.corejava.basics;

class ReferenceDemo{
	int var1=10;
	int display() {
		double salary=0.0;
		System.out.println("Value is: "+var1);
		return 0;
	}
}

public class ReferenceClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceDemo demo= new ReferenceDemo();
		System.out.println(demo);
		System.out.println(demo.display());
		

	}

}
