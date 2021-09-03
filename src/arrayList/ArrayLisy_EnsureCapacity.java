package arrayList;

import java.util.ArrayList;

public class ArrayLisy_EnsureCapacity {

	public static void main(String[] args) {
		
		
		// ArrayList ensureCapacity() example
		//Java program to use ensureCapacity() method to increase the size of an arraylist after it’s initialization

		ArrayList<String> list = new ArrayList<>(2);
        
        list.add("A");
        list.add("B");
       
        System.out.println(list);
         
        list.ensureCapacity(20);
         
        list.add("C");
        list.add("D");
        list.add("E");
 
        System.out.println(list);
        
        //for-each loop
        list.forEach(list1 -> System.out.println(list1.toLowerCase()));
        
        //get
        System.out.println("Getting the index 2 value :"+list.get(2));
	}

}
