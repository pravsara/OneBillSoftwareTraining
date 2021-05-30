package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPerson {

	public static void main(String[] args) {
		ArrayList<Person> paarayList = new ArrayList<Person>();
		paarayList.add(new Person(25,"Rohan"));
		paarayList.add(new Person(20,"Trump"));
		paarayList.add(new Person(30,"Bharath"));
		Collections.sort(paarayList);
		for(Person p:paarayList) {
			System.out.println(p.getId());
		}

	}

}
