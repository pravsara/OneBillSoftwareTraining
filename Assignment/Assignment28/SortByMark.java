package com.onebill.corejava.basics.Assignment28;

import java.util.Comparator;

public class SortByMark implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o2.marks - o1.marks;

	}

}
