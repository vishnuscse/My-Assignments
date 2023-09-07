package week3.homeassigment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		// Sort the array
		Arrays.sort(arr);
		System.out.println("Sorted Array is: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = arr[0]; i < arr.length; i++) {
			//// check if the iterator variable is not equal to the array values respectively
			if(i!=+arr[i]) {
				System.out.println(i);
			}
			
		}

	}

}
