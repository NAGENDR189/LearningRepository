package linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Add_Remove_Iterator {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Nagu");
		ll.add("Nagu");
		ll.add("Nagu");

		
		ll.add(1, "Gadi");
		
		ll.addFirst("189");
		
		System.out.println(ll);
		
		ll.remove("Nagu");
		
		System.out.println(ll);
		
		ListIterator<String> it =  ll.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		//1. LinkedList to Array
		
		String[] s = ll.toArray(new String[ll.size()]);
		
		System.out.println(Arrays.toString(s));
	}

}
