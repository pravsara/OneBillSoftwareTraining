package com.onebill.corejava.basics.Assignment29;

import java.util.Comparator;

class SortByAge implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.age - b.age;
    }
}
