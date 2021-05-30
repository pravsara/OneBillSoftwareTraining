package com.onebill.corejava.basics.map;

import java.util.Date;

interface DateInterface {
	int process();
	static Date nowDate() {
		return new Date();
	}
	default String formatDate(Date date) {
		return date.toString();
	}
	default int calculate(int a,int b) {
		return a+b;
	}
}

public class LambdaDateExample {

	public static void main(String[] args) {
		java.util.Date date=new java.util.Date();  
		DateInterface ref = () -> 100;
		System.out.println(ref.process());
		System.out.println(ref.formatDate(date));
		System.out.println(ref.calculate(100, 200));

	}

}
