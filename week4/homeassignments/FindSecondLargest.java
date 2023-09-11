package week4.day1.homeassignments;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class FindSecondLargest {

	public static void main(String[] args) {
		
		// Here is the input
				int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;
				
		//a) Create a empty Set Using TreeSet
				Set<Integer> set = new TreeSet<Integer>();
		//b) Declare for loop iterator from 0 to data.length and add into Set 
				
				for (int i = 0; i < data.length; i++) {
					set.add(data[i]);
					
				//{3,2,11,4,6,7} -> After Sorting {2,3,4,6,7,11}
				
					
					
				}
				
				System.out.println(set);
		//c) convert Set into List
				List<Integer> list = new ArrayList<>(set);
		
		//d) Print the second last element from List
				int length = list.size();
				System.out.println("The Second Largest Element is: ");
				System.out.println(list.get(length-2));
				
				
				
				

	}

}
