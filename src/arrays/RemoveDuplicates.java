package arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "javaTpoint is the best learning website";   
       
		//removeDuplicates() method by passing the string as an argument   
        removeDuplicates(str);
		
	}

	private static void removeDuplicates(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();   
       
        for(int i=0;i<str.length();i++)   
            set.add(str.charAt(i));   
            
          
        for(Character ch : set)   {
            System.out.print(ch);   
    }   
	}

}
