package com.onebill.corejava.basics.Assignment24;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		int inp;		
		int temp1 = 1;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your value:");
		inp = sc.nextInt();
		int temp = inp-2;
		while (inp>0) {
			System.out.println("");
			for (i = 0; i <= temp; i++) {
				System.out.print(" ");
			}
			for(i = 1; i <=temp1; i++) {
				System.out.print(temp1+" ");
			}
			temp1++;
			temp--;
			inp--;
		
		}
	}

}
