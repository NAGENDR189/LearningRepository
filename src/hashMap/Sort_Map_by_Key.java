package hashMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort_Map_by_Key {

	public static void main(String[] args) {

		Map<String, String> map = new	LinkedHashMap<String, String> ();
		
		map.put("USA", "A");
		map.put("zxy", "B");
		map.put("EFG", "C");
		map.put("QWE", "D");
		map.put("NAGU", "E");
		
		System.out.println("Actual Order: "+map);
		
		Map<String, String> map1 = new TreeMap<String, String> (map);
		
		System.out.println("After sorting the list: "+map1);
		
        Map<String, String> map2 = new TreeMap<String, String> (Collections.reverseOrder());
		map2.putAll(map1);
		System.out.println("Reverse Order: "+map2);
		
		

		
	}

}
