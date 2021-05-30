package com.onebill.corejava.basics.Day5;



class Test {
	interface Demo {
		void show();
	}
}

class Testing implements Test.Demo {
	public void show( ) {
		System.out.println("show method inside interface");
	}
}

public class InterfaceInsideClass {
//	interface Demo {
//		void show();
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testing ex = new Testing();
		ex.show();
		
	}

}
