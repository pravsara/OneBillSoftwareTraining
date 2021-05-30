package com.onebill.corejava.basics.exceptionhandling;

import java.util.Scanner;

//minbal,negvalue
class MinBalanceCustomException extends Exception {
	public MinBalanceCustomException(String str) {
		super(str);
	}
}
class NoNegativeException extends Exception {
	public NoNegativeException(String str) {
		super(str);
	}
}

public class Bank {
	static int bal = 1000;
	static String str = "1000    ";
	
	static void debit(int db) {
		try {
			if(db < 0) {
				throw new NoNegativeException("NoNegativeException");
			}
			else if(bal - db < 1000) {
				throw new MinBalanceCustomException("Insufficient Balance");
			}
			else {
				bal -= db;
				System.out.println("Debited");
				str += db;
				str += "Db    ";
				System.out.println("Balance: "+bal);
			}
		} catch (MinBalanceCustomException e) {
			System.out.println(e.getMessage());
		} catch (NoNegativeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void credit(int cr) {
		try {
			if (cr < 0) {
				throw new NoNegativeException("NoNegativeException");
			} else {
				bal += cr;
				System.out.println("Credited");
				str += cr;
				str += "Cr    ";
				System.out.println("Balance: " + bal);
			}
		} catch (NoNegativeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void display() {
		System.out.println(str);
		System.out.println("Balance: "+bal);
	}

	public static void main(String[] args) {
		
		int inp;
		int db;
		int cr;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.Debit\n2.Credit\n3.History\n4.Exit\nEnter your choice: ");
			inp = sc.nextInt();
			if(inp == 1) {
				System.out.println("Enter the amount to be debited :");
				db = sc.nextInt();
				debit(db);
			}
			else if(inp == 2) {
				System.out.println("Enter the amount to be credited :");
				cr = sc.nextInt();
				credit(cr);
			} 
			else if(inp == 3) {
				display();
			}
			else if(inp == 4) {
				
			}
			else {
				System.out.println("Invalid Input");
			}
		}while (inp != 4);
		System.out.println("End");
	}

}
