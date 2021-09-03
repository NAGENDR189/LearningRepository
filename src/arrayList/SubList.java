package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SubList {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		
		ArrayList<Integer> sublist1 = new ArrayList<Integer> (list.subList(3, 8));
		
		System.out.println(list);
		
		System.out.println(sublist1);
		
		ArrayList<Integer> sublist2 = new ArrayList<Integer> (list.subList(2, list.size()));
		
		System.out.println(sublist2);
		
		list.subList(0, 4).clear();
		
		System.out.println(list);
		
		//Converting ArrayList to Array
		
		Integer[] numbers = list.toArray(new Integer[list.size()]);
		
		System.out.println(Arrays.toString(numbers));
		
		



	}

}
