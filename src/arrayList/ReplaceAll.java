package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceAll {

	//Java program to use replaceAll() method to transform all the elements of an arraylist using a lambda expression
	
	public static void main(String[] args) {

		ArrayList<String> alst = new ArrayList<String>(Arrays.asList("Nag", "gadi", "Nag", "gadi","Nag", "gadi","Nag", "gadi"));
		
		System.out.println(alst);
		
		alst.replaceAll(a -> a.toUpperCase());
		
		System.out.println(alst);

		
	}

}
