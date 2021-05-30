package com.onebill.corejava.basics.Assignment24;

import java.util.Scanner;

public class Cube {
	
	static double result(int i) {
		return Math.pow(i, 3);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp;
		System.out.println("Enter your value limit:");
		inp = sc.nextInt();
		for(int i=1; i <= inp; i++) {
			System.out.println(result(i));
		}
		sc.close();

	}

}
