package hashMap;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_Words_in_String {

	public static void main(String[] args) {

		String text =  "N N N a g e a n d r a n g r r g g r a a n n a a n a";
		
		List<String> list = Arrays.asList(text.split(" "));
		
		Set<String> set = new LinkedHashSet<String>(list);
		
		for(String test1 : set) {
			System.out.println(test1 + ": "+ Collections.frequency(list, test1 ));
		}
	}

}
