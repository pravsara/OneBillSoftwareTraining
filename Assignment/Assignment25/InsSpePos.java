package com.onebill.corejava.basics.Assignment25;

import java.util.Scanner;

public class InsSpePos {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 5;
		arr[2] = 10;
		arr[3] = 2;
		int size = 4;
		System.out.println("The present Array is: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int pos;
		int value;
		Scanner sc = new Scanner(System.in);
		do {
			
		System.out.println("\nEnter your Position to Insert/ -1 for Exit: ");
		pos = sc.nextInt();
		if ((size == 10)&&(pos > 10)) {
			System.out.println("Array Overflow");
		}
		else if(pos == -1) {
			
		}
		else {
		System.out.println("Enter the value: ");
		value = sc.nextInt();
		for(int i=size; i>=pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos-1] = value;
		size++;
		for(int i:arr) {
			System.out.print(i+" ");
		}
			}
		} while ((pos != -1)&&(size != 10));
		sc.close();
		System.out.println("End");
	}

}
