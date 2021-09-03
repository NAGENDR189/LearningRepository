package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Basics {

	public static void main(String[] args) {
		
		//HashMap in Java in a collection class which implements Map interface. 
		//It is used to store key & value pairs. Each key is mapped to a single value in the map.
		
		HashMap<Integer, String> map = new 	HashMap<Integer, String> ();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());

		map.remove(1);
		System.out.println(map);

		Iterator<Map.Entry<Integer,String>> itr1 = map.entrySet().iterator();
        while(itr1.hasNext())
        {
            Map.Entry<Integer,String> entry = itr1.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
		}
	

}
