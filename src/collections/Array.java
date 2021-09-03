package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[] {"Apple", "Banana", "Coconut","Dumb"};
		
		System.out.println(arr.length);
		
		//Convert single array element to ArrayList
		
		Boolean   bl = Arrays.asList(arr).contains("Apple");  // True
	    int     index=	Arrays.asList(arr).indexOf("Dumb"); //3
	 
	    System.out.println(bl);
	    System.out.println(index);
		
		//Whole array converting to arraylist
		
		ArrayList<String> list = new ArrayList<>( Arrays.asList("Apple", "Banana", "Coconut","Dumb"));
		
		System.out.println(list.size());
		
		System.out.println(list.contains("Apple"));
		
		//Clone of an Array
		
		int a[] = {1,2,3,4,5};
		
		int b[] = a.clone();
		
        System.out.println("Elements in the array a[] :");
		
		for(int i=0; i<a.length; i++) {
		
			System.out.print(a[i]);
		}
		
		System.out.println("Elements in the array b[] :");
		
		for(int i=0; i<b.length; i++) {
			
			//Changing the b[] to verify that different from a[]
			b[i]++;

			System.out.print(b[i]);
		}
		
		
	}

}
