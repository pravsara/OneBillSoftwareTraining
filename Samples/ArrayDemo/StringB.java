package com.onebill.corejava.basics.ArrayDemo;

public class StringB {
	public static void concat1(String s1) {
		s1 = s1+"for freshers";
	}
	public static void concat2(StringBuffer s2) {
		s2.append("for freshers");
	}
	public static void concat3(StringBuilder s3) {
		s3.append("for freshers");
	}
	public static void main(String[] args) {
		String s1 = "TechnoElevate";
		concat1(s1);
		System.out.println("String: "+s1);
		StringBuffer s2 = new StringBuffer("TechnoElevate");
		concat2(s2);
		System.out.println("String Buffer: "+s2);
		StringBuilder s3 = new StringBuilder("TechnoElevate");
		concat3(s3);
		System.out.println("String Builder: "+s3);
	}

}
