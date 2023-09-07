package week3.homeassigment;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};
		
		//1) Arrange the array in ascending order
		Arrays.sort(data);
		System.out.println("Total Array Length:");
		System.out.println(data.length);
		//Defining a Variable with 2nd Greatest by Position
		int i = (data.length)-2;
		
		//2) Pick the 2nd element from the last and print it
		System.out.println("The Second Largest Number is the Given Array is: " +data[i]);
		
		

	}

}
