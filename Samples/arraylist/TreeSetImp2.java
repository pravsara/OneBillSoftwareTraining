package arraylist;

import java.util.TreeSet;

public class TreeSetImp2 {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>(new SortByPersonName());
		ts.add(new Person(26,"Rahul"));
		ts.add(new Person(19,"Kiran"));
		ts.add(new Person(21,"Aryan"));
		ts.add(new Person(85,"Bhaskar"));
		
		System.out.println(ts);
		/*for(Person p: ts) {
			System.out.println(p.getPcharacter());
		}*/

	}

}
