package session3;

import java.util.Arrays;

public class SortandInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] value1 = { 50, 30, 20, 40, 10 };

		for (int numbers : value1) {

			System.out.println(numbers);
			
		}
		
		// Sorting Arrays
		Arrays.sort(value1);
		System.out.println("Sorted Array.");

		for (int number : value1) {
			System.out.println(number);
		}

		
		// Insert elements into Array
		Arrays.fill(value1, 70);  
		
		for (int nemo : value1) {
			System.out.println(nemo);
			break;
		}

	}

}
