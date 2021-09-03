package hashMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sort_Map_by_Values {

	public static void main(String[] args) {

		Map<String, Integer> unSortedMap = new HashMap<>();
		
		unSortedMap.put("Abc", 1);
		unSortedMap.put("bcd", 2);
		unSortedMap.put("cde", 4);
		unSortedMap.put("def", 3);
		unSortedMap.put("xyz", 5);
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
		
		System.out.println("UnSorted Map : " + unSortedMap);
		System.out.println("Sorted Map   : " + sortedMap);
		
		Map<String, Integer> reverseSortedMap = new LinkedHashMap<>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));
		
		System.out.println("ReverseSorted Map   : " + reverseSortedMap);

	}

}
