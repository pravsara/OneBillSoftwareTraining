package com.onebill.corejava.basics.Assignment25;

public class SeqOfChar {
	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Programming";
		if(str1.contains(str2)) {
			System.out.println(str2+" is present in "+str1);
		}
		else {
			System.out.println("It doesn't contain");
		}
	}

}
