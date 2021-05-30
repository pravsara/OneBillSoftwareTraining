package com.onebill.corejava.basics.Day5;

interface InterfaceOne {
	void methodOne();
}

interface InterfaceTwo {
	void methodTwo();
}

interface InterfaceThree extends InterfaceOne, InterfaceTwo {
	void methodThree();
}

public class MultiInterface implements InterfaceThree{

	interface Interfacefor {
		void methodFour();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiInterface ex= new MultiInterface();
		ex.methodOne();
		ex.methodTwo();
		ex.methodThree();
		
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("Method One called");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Method Two called");
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("Method Three called");
	}

}
