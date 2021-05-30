package com.onebill.corejava.basics.Assignment25;

import java.util.Scanner;

public class DelSpePos {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int value;
		int j;
		int size = 10;
		System.out.println("The present Array is: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\nEnter the value to be removed: ");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		for(int i=0; i<size; i++) {
			if(arr[i] == value) {
				for(j=i; j<size-1; j++) {
					arr[j] = arr[j+1];
				}
				size--;
				arr[j] = 0;
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
