package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveIf {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(14,16,19,50,1,2,3,4,5,6,7,8,9,10));
		
		numbers.removeIf(number -> number%2 != 0);
		
		System.out.println(numbers);
		
	    Collections.sort(numbers);
	    
		System.out.println(numbers);

	    
	}

}
