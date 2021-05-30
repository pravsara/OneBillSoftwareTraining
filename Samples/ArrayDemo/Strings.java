package com.onebill.corejava.basics.ArrayDemo;

public class Strings {

	public static void main(java.lang.String[] args) {
		String str = "OneBill";
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		StringBuilder sbr1 = new StringBuilder(str);
		sbr1.append(" for future");
		System.out.println(sbr1);
		StringBuffer sb = new StringBuffer("Demo");
		StringBuilder sb1 = new StringBuilder("Demo1");
		String sb_String = sb.toString();
		System.out.println("StringBuffer object to string:" +sb_String);
		String sb1_STring = sb1.toString();
		System.out.println("StringBuilder object to string: "+sb1_STring);
		

	}

}
