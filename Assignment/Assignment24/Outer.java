package com.onebill.corejava.basics.Assignment24;


public class Outer {
	void method() {
		class MethodInner {
			public void print() {
				System.out.println("This is method inner class");
			}
		}
		MethodInner inner = new MethodInner();
		inner.print();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.method();

	}

}
