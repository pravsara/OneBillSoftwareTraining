package com.onebill.corejava.basics.Assignment28;

import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMap1 {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Praveen");
		hm.put(101, "Mohan");
		hm.put(102, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
