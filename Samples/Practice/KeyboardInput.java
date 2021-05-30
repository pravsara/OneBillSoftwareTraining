package com.onebill.corejava.basics;

import java.io.IOException;

public class KeyboardInput {
public static void main(String[] args) {
	char ch;
	try {
	ch=(char) System.in.read();
	System.out.println("You have entered:"+ch);
	} catch(IOException e) {
		e.printStackTrace();
	}
	
	}
}

