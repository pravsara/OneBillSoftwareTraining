package com.onebill.corejava.basics.ArrayDemo;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[] {1,2,3};
		arr[1] = new int[] {1,2,3,4};
		arr[2] = new int[] {1,2,3};
		for(int[] x:arr) {
			System.out.println(Arrays.toString(x));
	
		}
	}

}
