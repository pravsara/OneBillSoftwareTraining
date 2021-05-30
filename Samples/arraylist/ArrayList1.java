package arraylist;

import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println(arrayList);
		
		System.out.println("set with index and element");
		arrayList.set(2,90);
		System.out.println(arrayList);
		
		List<Integer> subList = arrayList.subList(1, 3);
		System.out.println(subList);

	}


}
