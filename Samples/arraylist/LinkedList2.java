package arraylist;

import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		LinkedList<String> plang = new LinkedList<String>();
		plang.add("Java");
		plang.add("html");
		plang.add("python");
		plang.add("c++");
		plang.add("ruby");
		System.out.println("list: "+plang);
		
		System.out.println(plang.get(1));
		
		plang.set(1, "sql");
		System.out.println(plang);

	}

}
