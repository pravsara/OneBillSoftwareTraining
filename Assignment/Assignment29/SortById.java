package com.onebill.corejava.basics.Assignment29;

import java.util.Comparator;

class SortById implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.id - b.id;
    }
}
