package arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(90);
		list.add(30);
		list.add(35);
		list.add(20);
		System.out.println(list);
		System.out.println("---add with index---");
		list.add(0, 100);
		list.add(1, 80);
		System.out.println(list);
		System.out.println("---removes (index) and remove(object");
		list.remove();
		list.remove(3);
		list.remove(new Integer(20));
		System.out.println(list);
		System.out.println("---set at index---");
		list.set(1, 75);
		System.out.println(list);
		list.add(99);
		list.add(10);
		System.out.println(list);
		System.out.println("---containsAll---");
		LinkedList<Integer> ls = new LinkedList<Integer>();
		ls.add(100);
		ls.add(99);
		System.out.println(list);
		System.out.println(ls);
		System.out.println(list.containsAll(ls));
		ls.addFirst(1);
		System.out.println(ls);
		
	}

}
