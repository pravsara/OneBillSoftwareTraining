package com.onebill.corejava.basics.ArrayDemo;

public class StringSwitchDemo {

	public static void main(String[] args) {
		String command="disconnect";
		switch (command) {
		case "connect" :
			System.out.println("Connecting..");
			break;
		case "cancel" :
			System.out.println("Cancelling..");
			break;
		case "disconnect":
			System.out.println("Disconnecting..");
			break;
		default:
			break;
		}

	}

}
