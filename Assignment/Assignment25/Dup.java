package com.onebill.corejava.basics.Assignment25;

public class Dup {

	public static void main(String[] args) {
		int[] arr = {1,2,2,5,3,4,6,5};
		System.out.println("Array: ");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\nDuplicate Elements: ");
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
