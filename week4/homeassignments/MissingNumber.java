package week4.day1.homeassignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] num = {5,6,1,3,4,2,7,10,9};
		
		//a) Remove the duplicates using Set
		Set<Integer> set = new HashSet<>();
		
		// b) Make sure the set is in the ascending order
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println("The Sorted Numbers are");
		System.out.println(set);
		
		List<Integer> list = new ArrayList<>(set);
		
		//c) Iterate from the starting number and verify the next number is + 1
	
		for (int i = 0; i < list.size()-1; i++) {
			//d) If did not match, that is the number
			if (list.get(i+1) != list.get(i) + 1 ) {
				System.out.println("The Missing Number is: ");
				System.out.println(list.get(i) + 1);
				break;
			}
			
		}
			
		}
		
		
	}