package com.onebill.corejava.basics.NestedClass;

class OuterDemo {
	int number;
	private class InnerDemo {
		void print() {
			System.out.println("This is inside inner class");
		}
	}
	
	void display() {
		InnerDemo innerDemo = new InnerDemo();
		innerDemo.print();
	}
}

public class MyClass {

	public static void main(String[] args) {
		OuterDemo outerDemo = new OuterDemo();
		outerDemo.display();

	}

}
