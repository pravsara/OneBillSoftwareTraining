package com.onebill.corejava.basics.Assignment24;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int inp;
		int sum = 0;
		System.out.println("Enter your value limit:");
		inp = sc.nextInt();
		for(int i = 1; i <= inp; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}

}
