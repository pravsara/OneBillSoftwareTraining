package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListImp1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		System.out.println("Use for loop");
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Use for each loop");
		for(Integer i: arrayList) {
			System.out.println(i);
		}
		System.out.println("Iterator");
		Iterator<Integer> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("ListIterator");
		ListIterator<Integer> listiterator = arrayList.listIterator();
		while (listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		ListIterator<Integer> listiterator1 = arrayList.listIterator(4);
		while (listiterator1.hasPrevious()) {
			System.out.println(listiterator1.previous());
		}
	}

}
