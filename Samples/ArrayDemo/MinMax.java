package com.onebill.corejava.basics.ArrayDemo;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {99,9,18,-9,999};
		int min = num[0], max = num[0];
		for(int i=0; i<=4; i++) {
			if(num[i] < min) 
				min = num[i];
			if(num[i] >max)
				max = num[i];
		}
		System.out.println(min+" "+max);
	}

}
