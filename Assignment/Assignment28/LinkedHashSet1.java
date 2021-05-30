package com.onebill.corejava.basics.Assignment28;

import java.util.*;

class LinkedHashSet1 {
	public static void main(String args[]) {
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		al.add("Praveen");
		al.add("Vijay");
		al.add("Ragul");
		al.add("Vijay");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
