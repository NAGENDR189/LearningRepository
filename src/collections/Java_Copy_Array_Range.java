package collections;

import java.util.Arrays;
import java.util.List;

public class Java_Copy_Array_Range {

	public static void main(String[] args) {
		
		String[] names = {"Alex", "Brian", "Charles", "David"};
		
		//Subarray to Arraylist
		
		String[] partialnames = Arrays.copyOfRange(names, 0, 2);
		
		System.out.println(Arrays.toString(partialnames));
		
		
		//Subarray to Arraylist
		
		List<String> nameList = Arrays.asList(Arrays.copyOfRange(names, 2, 10));
		
		System.out.println(nameList);

	}

}
