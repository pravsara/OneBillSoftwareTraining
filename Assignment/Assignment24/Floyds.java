package com.onebill.corejava.basics.Assignment24;

import java.util.Scanner;

public class Floyds {
	public static void main(String[] args) {
		
		int i=1;
		int inp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value:");
		inp = sc.nextInt();
		for(int j=0; j<inp; j++) {
			for(int k=0; k<=j; k++) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println("");
		}
		sc.close();
	}
}
