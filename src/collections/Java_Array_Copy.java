package collections;

import java.util.Arrays;

public class Java_Array_Copy {

	public static void main(String[] args) {
		
		// 1) array.clone()
		
		String[] names = {"Alex", "Brian", "Charles", "David"};
		
		String[] cloneNames = names.clone();
		
		System.out.println(Arrays.toString(cloneNames));
		
		System.out.println(Arrays.toString(names));
		
		// 2) Arrays.copyOf()
		
		String[] copyNames = Arrays.copyOf(names, names.length);
		
		System.out.println(Arrays.toString(copyNames));
		
		

	}

}
