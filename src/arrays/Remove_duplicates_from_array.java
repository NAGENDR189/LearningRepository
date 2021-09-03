package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_duplicates_from_array {

	public static void main(String[] args) {
		
		Integer[] numbers = new Integer[] {1,2,3,4,5,1,3,5};
		
		System.out.println(Arrays.toString(numbers));
		
		Set<Integer> HashSet = new HashSet<>(Arrays.asList(numbers));
		
		System.out.println(HashSet);
		
		Integer[] numbersWithoutDuplicates = HashSet.toArray(new Integer[] {});
		
		System.out.println(Arrays.toString(numbersWithoutDuplicates));
		
		
		//Removing duplicate string
		
		String[] names = new String[] {"Nag", "Nag", "Nagu", "Nagu"};
		
		System.out.println(Arrays.toString(names));
		
		HashSet<String> hashset = new HashSet<>(Arrays.asList(names));
		
		String[] namesWithoutDuplicate = hashset.toArray(new String[] {});
		
		System.out.println(Arrays.toString(namesWithoutDuplicate));
		
		
		//Removing Duplicate Charecters from string
		
		String name = "Nagendragadi";
		
	    LinkedHashSet<Character> set = new LinkedHashSet<Character>();
	    
	    for(int i=0; i<name.length(); i++) {
	    	set.add(name.charAt(i));
	    }
		
	    System.out.println(set);
	    
	    for(Character ch : set)   {
            System.out.print(ch);   
    }  
	   
	
	    
	 
		
	// Removing duplicates using Streams
		
	    System.out.println("         ");
		Integer[] origArray = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };
		 
		List<Integer> listWithoutDuplicates = Arrays.asList(origArray)
		                        .stream()
		                .distinct()
		                .collect(Collectors.toList());
		  
		System.out.println(listWithoutDuplicates);

	}


}
