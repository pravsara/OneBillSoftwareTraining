package com.onebill.corejava.basics.ArrayDemo;

public class Squares {

	public static void main(String[] args) {
		int[][] squ = new int[10][2];
		for(int i=0; i<10; i++) {
			squ[i][0] = i+1;
			squ[i][1] = squ[i][0] * squ[i][0];
			System.out.println(squ[i][0]+" "+squ[i][1]);
		}
		System.out.println();

	}

}
