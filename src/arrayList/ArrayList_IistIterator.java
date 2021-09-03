package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ArrayList_IistIterator {

	public static void main(String[] args) {
		
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "A", "A"));
		
		ListIterator<String> listItr = alphabets.listIterator();
		
		//System.out.println(listItr.next());

		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		//Add
		
		listItr.add("E");
		
		System.out.println(alphabets);
		
		System.out.println(listItr.previous());
		
		//Remove
		
		listItr.remove();
		System.out.println(alphabets);
		
		


		/*          ITERATOR	                                            LISTITERATOR
		
		Can be used to iterate all collection classes.	 Can be used to iterate only List implemented classes.
		Supports only forward direction only iteration.	 Supports both forward and backward direction iterations.
		Supports only READ and DELETE operations.	     Supports all CRUD operations.
		Obtained through iterator() method.	             Obtained through listIterator() method. */

	}

}
