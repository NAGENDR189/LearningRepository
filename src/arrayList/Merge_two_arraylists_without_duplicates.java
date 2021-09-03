package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Merge_two_arraylists_without_duplicates {

	public static void main(String[] args) {

		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
        
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "f", "g"));
        
        Set<String> set = new LinkedHashSet<String>(listOne);
        
        set.addAll(listTwo);
        
        Set<String> combinedSet = new LinkedHashSet<String>(set);
        
        System.out.println(combinedSet);

	}

}
