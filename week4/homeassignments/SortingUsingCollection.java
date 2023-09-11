package week4.day1.homeassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		//// Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)
		
		String[] str = {"HCL" , "Wipro",  "Aspire Systems", "CTS"};
		
		List<String> list = new ArrayList<>();
		
		//// get the length of the array	
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);
			
		}
		//// sort the array
		Collections.sort(list);
		System.out.println("Sorted List");
		System.out.println(list);
		
		//// Iterate it in the reverse order
		for (int i = list.size()-1; i >= 0; i--) {
			//// print the array
			System.out.print("'" +list.get(i)+ "'");
			
		}
		
		

	}

}
