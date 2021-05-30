package com.onebill.corejava.basics.Assignment25;

public class RevArr {

	public static void main(String[] args) {
		System.out.println("Array :");
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int temp;
		for(int i:arr) {
			System.out.print(i+" ");
		}
		for (int i=0, j=9; i<10 & i<j; i++,j--) {
			
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
		}
		System.out.println("\nReverse Array");
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
