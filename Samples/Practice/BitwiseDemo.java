package com.onebill.corejava.basics;

public class BitwiseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=1;
		int second=2;
		int third=3;
		first|=4;
		second >>= 1;
		third <<= 1;
		first^=third;
		System.out.println(first+""+second+""+third);

	}

}
