package collections;

import java.util.Arrays;
import java.util.regex.Pattern;

public class JavaStringToStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Convert String to String[]
		
		// 1. String.spilt()
		
		String names = "Nagu,Nagu1,Nagu2,Nagu3";
		
		String[] namesArray = null;
		
		namesArray = names.split(",");
		
		System.out.println(Arrays.toString(namesArray));
		
		
		// 2. Pattern.split()
		
		String[] namesArray1 = null;
		
		Pattern pattern = Pattern.compile(",");
		
		namesArray1 = pattern.split(names);
		

		System.out.println(Arrays.toString(namesArray1));
		
		
		// String[] to string - By using String.join()
		
        String[] tokens = {"How","To","Do","In","Java"};
        
        String join1 = String.join("", tokens);
        
        System.out.println(join1);
        
        String join2 = String.join(",", tokens);
        
        System.out.println(join2);

	}

}
