package arrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayList_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//add
		ArrayList<String> names= new ArrayList<>();
		names.add("Nagendra");
		names.add("Gadi");
		names.add("ABCDEFGHIJK");
		
		System.out.println(names);
		
		//addAll
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.addAll(names);
		
		list2.add("List1+List2");
		
		System.out.println(list2);
		
		//addAll (int fromIndex, Collection c) 
		
		names.addAll(2, list2);
		System.out.println(names);
		
		LinkedHashSet<String> abc = new LinkedHashSet<String>(names);
		System.out.println(abc);
		
		//Clear
		names.clear();
		System.out.println(names);
		
		//Clone
		@SuppressWarnings("unchecked")
		ArrayList<String> list3 =  (ArrayList<String>)list2.clone();
		System.out.println(list3);
		
		//Contains
		
		System.out.println(list3.contains("Gadi"));

		System.out.println(names.contains("Gadi"));

		System.out.println(list3.indexOf("Gadi"));

		System.out.println(list3.lastIndexOf("Nagendra"));
		
		String s = "ABHCDEFGHA";
		System.out.println(s.indexOf("A"));
		System.out.println(s.indexOf("H"));
	}

}
