package com.onebill.corejava.basics.Day5;

interface Outer {
	interface Inner {
		void showInsideInner();
	}
	void showInsideOuter();
}

class Demo implements Outer.Inner, Outer {

	@Override
	public void showInsideOuter() {
		// TODO Auto-generated method stub
		System.out.println("implementation for showInsideOuter");
	}

	@Override
	public void showInsideInner() {
		// TODO Auto-generated method stub
		System.out.println("implementation for showInsideInner");
	}
	
}
public class InterfaceInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer;
		Outer.Inner inner;
		Demo imp = new Demo();
		outer = imp;
		inner = imp;
		inner.showInsideInner();
		outer.showInsideOuter();
	}

}
