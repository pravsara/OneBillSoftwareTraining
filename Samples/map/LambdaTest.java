package com.onebill.corejava.basics.map;

interface FunctionalInt {
	void abstractMethodDemo(int x);
	default void normalMethod() {
		System.out.println("Hello from normalMethod()");
	}
	static void staticMethod() {
		System.out.println("Hello from static Method...");
	}
}

public class LambdaTest {

	public static void main(String[] args) {
		FunctionalInt ref = (int x) -> {
			System.out.println("Hello from abstractMethod....");
		};
		ref.abstractMethodDemo(10);
		ref.normalMethod();
		FunctionalInt.staticMethod();

	}

}
