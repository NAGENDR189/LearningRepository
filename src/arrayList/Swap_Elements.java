package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Swap_Elements {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
		
		System.out.println(list1);
		
		Collections.swap(list1, 0, 4);
		
		System.out.println(list1);

	}

}
