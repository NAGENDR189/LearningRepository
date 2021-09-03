package linkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Sort {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>(Arrays.asList("A","C","B","D"));
		
		System.out.println(ll);
		
		Collections.sort(ll);
		
		System.out.println(ll);

		Collections.sort(ll, Collections.reverseOrder());
		
		System.out.println(ll);


	}

}
