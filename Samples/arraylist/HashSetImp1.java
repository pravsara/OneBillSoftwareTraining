package arraylist;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetImp1 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(500);
		hs.add(100);
		hs.add(null);
		hs.add(200);
		hs.add(300);
		hs.add(null);
		hs.remove(null);
		System.out.println(hs);
		System.out.println("Size: "+hs.size());
		
		Iterator<Integer> iterator = hs.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
