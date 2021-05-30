package com.onebill.corejava.basics.Assignment29;

import java.util.Comparator;

class SortByMarks implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
    	return a.marks - b.marks;
    }
}
