package com.onebill.corejava.basics.Assignment25;

import java.util.Arrays;

public class Second {

	public static void main(String[] args) {
		int arr[] = {1,5,8,2,4,7,3,6,9,10};
		System.out.println("The Array is: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe Second Smallest value is: "+arr[1]+"\nThe Second Largest value is: "+arr[arr.length-2]);

	}

}
