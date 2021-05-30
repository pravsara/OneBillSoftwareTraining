package arraylist;
import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> arrayString = new ArrayList<String>();
		arrayString.add("welcome");
		arrayString.add("to");
		arrayString.add("technoelevate");
		
		String[] stringarray = new String[arrayString.size()];
		for(int i=0; i<arrayString.size();i++) {
			stringarray[i] = arrayString.get(i);
			System.out.println(stringarray[i]);
		}
		
		

	}

}
