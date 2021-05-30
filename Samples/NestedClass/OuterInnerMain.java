package com.onebill.corejava.basics.NestedClass;

class Outer {
	class Inner {
		public void show() {
			System.out.println("Inside nested class");
		}
	}
}

public class OuterInnerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}

}
