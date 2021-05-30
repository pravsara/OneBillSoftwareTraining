package com.onebill.corejava.basics;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char inp;
		Scanner sc=new Scanner(System.in);
		while(true) {
			inp = sc.next().charAt(0);
			if(inp=='q') {
				break;
			}
		}
		System.out.println("End");
		sc.close();
	}

}
