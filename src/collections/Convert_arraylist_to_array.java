package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert_arraylist_to_array {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>(Arrays.asList("AB","BC","CD"));
		
		String[] s = al.toArray(new String[al.size()]);
		
		System.out.println(Arrays.toString(s));
		
		
	}

}
