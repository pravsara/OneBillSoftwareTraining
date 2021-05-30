package com.onebill.corejava.basics.Assignment25;

public class Code {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		String str1 = "";
		System.out.println("The original message is: "+str);
		int num[] = new int[str.length()];
		for(int i=0; i<str.length();i++) {
			num[i] = str.charAt(i)-65;
		}
		System.out.println("After encoding");
		for(int i=0; i<str.length();i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\nAfter deconding");
		for(int i=0; i<str.length(); i++) {
			str1 += (char)(num[i]+65);
		}
		System.out.println(str1);

	}

}
