package com.onebill.corejava.basics.Assignment29;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {
	static void printMessage(String name) {
		System.out.println("Hi " + name);
	}

	static void printValue(int val) {
		System.out.println(val);
	}

	public static void main(String[] args) {

		Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;
		consumer1.accept("Praveen");

		Consumer<Integer> consumer2 = ConsumerInterfaceExample::printValue;
		consumer2.accept(50); 
	}
	
}
