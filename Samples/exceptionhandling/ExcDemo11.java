package com.onebill.corejava.basics.exceptionhandling;

class FinallyDemo {
	public static void generateException(int what) {
		int[] num = new int[2];
		try {
			
		
		switch(what) {
		case 0: 
			int ans = 10/what;
			break;
		case 1:
			num[3] = 40;
			break;
		case 2:
			System.out.println("no exceptions");
			break;
		
		}
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array over run");
		}finally {
			System.out.println("100% executed..");
		}
	}
}
public class ExcDemo11 {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			FinallyDemo.generateException(i);
		}
	}

}
