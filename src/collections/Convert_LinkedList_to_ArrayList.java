package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Convert_LinkedList_to_ArrayList {

	public static void main(String[] args) {

		LinkedList<String> Llist1 = new LinkedList<>();
		
		Llist1.add("Nagendra");
		Llist1.add("Gadi");
		Llist1.add("Nagendra");
		Llist1.add("Gadi");
		
		System.out.println(Llist1);
		
		//Converting LinkedList to ArrayList
		
		ArrayList<String> alist = new ArrayList<>(Llist1);
		System.out.println(alist);

		
	}

}
