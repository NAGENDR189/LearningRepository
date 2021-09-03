package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_Iterations {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new 	HashMap<Integer, String> ();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map);
		
		//1) Using enrtySet() in for each loop


		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		//2) Using keySet() in for each loop
		
		for(Integer key: map.keySet()) {
			System.out.println(key);
		}
		
		//3) Using enrtySet() and iterator
		
	    HashMap<Integer, String> map1 = new HashMap<Integer, String> ();
		
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		map1.put(4, "D");
		map1.put(5, "E");
		
		System.out.println(map1);
		
		Iterator<Map.Entry<Integer,String>> itr1 = map1.entrySet().iterator();
		
		while(itr1.hasNext())
		{
		    Map.Entry<Integer, String> entry = itr1.next();
		    System.out.println(entry.getKey());
		   System.out.println(entry.getValue());
		}	
		
	}

}
