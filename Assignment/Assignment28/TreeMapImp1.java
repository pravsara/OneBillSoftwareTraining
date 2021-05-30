package com.onebill.corejava.basics.Assignment28;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImp1 {

	public static void main(String[] args) {
		TreeMap<Employee, Integer> tm = new TreeMap<Employee, Integer>(new SortById());
		tm.put(new Employee(1, "Bindu"),1);
		tm.put(new Employee(3, "Chaithra"),3);
		tm.put(new Employee(2, "Archana"),5);
		
		
		Set<Map.Entry<Employee, Integer>> m1 = tm.entrySet();
		for(Entry<Employee, Integer> itrvar: m1) {
			System.out.println(itrvar);
		}

	}

}
