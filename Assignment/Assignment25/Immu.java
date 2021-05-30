package com.onebill.corejava.basics.Assignment25;

public class Immu {

	public static void main(String[] args) {
		String str = "java ";
		System.out.println("Before Changes: "+str);
		str.concat("Programming");
		System.out.println("After Changes: "+str);
		System.out.println("Therefore String is immutable");

	}

}
