package com.onebill.corejava.basics.Assignment26;

class NonIntResultException extends Exception {
	public NonIntResultException(String str) {
		super(str);
	}
}

public class NonIntExc {

	public static void main(String[] args) {
		int[] numer = { 4, 8, 16, 32, 64, 128, 256, 512};
		int[] denom = { 2, 0, 4, 5, 0 };
		for(int i=0; i<numer.length; i++) {
			try {
				System.out.println(numer[i]/denom[i]);
				if(numer[i] % denom[i] != 0) {
					throw new NonIntResultException("NonIntResultException");
				}
			} catch(ArithmeticException e) {
				System.out.println("Can't divide by zero");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("No matching denominator found");
			} catch(NonIntResultException e) {
				System.out.println("Catching exception...");
				System.out.println(e.getMessage());
			}
		}

	}

}
