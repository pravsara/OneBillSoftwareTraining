package com.onebill.corejava.basics.inheritance;

class Sup {
	void who() {
		System.out.println("who inside super class");
	}
}

class Sub1 extends Sup {
	void who() {
		System.out.println("who inside subclass1");
	}
}

class Sub2 extends Sup {
	void who() {
		System.out.println("who inside subclass2");
	}
}
public class MainClass {

	public static void main(String[] args) {
		Sup so = new Sup();
		Sub1 s1o = new Sub1();
		Sub2 s2o = new Sub2();
		
		Sup ref;
		ref = so;
		so.who();
		
		ref = s1o;
		ref.who();
		
		ref = s2o;
		ref.who();
		
		
		//Dynamic method Dispatch

	}

}
