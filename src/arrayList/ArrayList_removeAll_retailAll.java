package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_removeAll_retailAll {

	public static void main(String[] args) {

		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D","A","A"));
		
		@SuppressWarnings("unchecked")
		ArrayList<String> alphabets1 = (ArrayList<String>) alphabets.clone();

		
		//Remove()
		
		alphabets.remove("B");
        
		System.out.println(alphabets);
		
		//Removing all the related elements 
		alphabets.removeAll(Collections.singleton("A"));
		
		System.out.println(alphabets);
		
		alphabets.removeAll(alphabets);
		
		System.out.println(alphabets);

       // Retaining all the same elements from list
		
		alphabets1.retainAll(Collections.singleton("A"));
		
		System.out.println(alphabets1);

		
	}

}
