package com.onebill.corejava.basics.Assignment25;

public class Ref {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6,7,8,9,10};
		int arr2[] = {10,9,8,7,6,5,4,3,2,1};
		arr2 = arr1;
		arr2[3] = 100;
		for(int i:arr2) {
			System.out.print(i+" ");
		}		

	}

}
