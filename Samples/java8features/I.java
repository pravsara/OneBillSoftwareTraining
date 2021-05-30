package com.onebill.corejava.basics.java8features;

public interface I {
	default void show() {
		System.out.println("show inside I class");
	}

}
