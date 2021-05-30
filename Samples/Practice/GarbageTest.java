package com.onebill.corejava.basics;

public class GarbageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageTest t1=new GarbageTest();
		GarbageTest t2=new GarbageTest();
		t1=null;
		System.gc();
		t2=null;
		Runtime.getRuntime();

	}
protected void finalize() throws Throwable {
	System.out.println("Garbage collector called");
}
}
