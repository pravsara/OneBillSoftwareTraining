package com.onebill.corejava.basics.Assignment24;

import java.util.Scanner;

public class IncDec {

	public static void main(String[] args) {
		int inp;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		inp = sc.nextInt();
		System.out.println("Enter the values:");
		int arr[] = new int[inp];
		for(int i=0; i<inp; i++) {
			arr[i] = sc.nextInt();
			if(i>0) {
				if (arr[i]>arr[i-1]) {
					count++;
				}
				else if (arr[i]<arr[i-1]) {
					count--;
				}
			}
		}
		if (count==(inp-1)) {
			System.out.println("Increasing");
		} else if (count == -(inp-1)) {
			System.out.println("Decreasing");
		}
		else {
			System.out.println("Neither Increasing nor Decreasing");
		}
		sc.close();

	}

}
