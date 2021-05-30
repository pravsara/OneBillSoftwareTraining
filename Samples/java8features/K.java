package com.onebill.corejava.basics.java8features;

public class K extends A implements I, J {

	public static void main(String[] args) {
		
		K k = new K();
		k.show();
		

	}
	
	 public void show() {
		 System.out.println("Show inside K class");
	 }

}
