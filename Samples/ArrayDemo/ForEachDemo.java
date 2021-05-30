package com.onebill.corejava.basics.ArrayDemo;

public class ForEachDemo {

	public static void main(String[] args) {
		short[] numbers = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		double avg = 0.0;
		for (int x:numbers) {
			System.out.println("Value is: "+x);
			sum += x;
		}
		System.out.println("Summation value is: "+ sum );
		avg = sum/numbers.length;
		System.out.println("Average value is: "+avg);
	}

}
