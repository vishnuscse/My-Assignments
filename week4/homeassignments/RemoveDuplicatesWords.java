package week4.day1.homeassignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		//a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		//Output= We learn java basics as part of sessions in week1
		
		//b) Split the String based on white spaces and save as String Array ,Then iterate the Array
		String[] Array = text.split(" ");
		System.out.println(Array[2]);
		
		//c) Create a empty Set 
		Set<String> set = new LinkedHashSet<String>();
		
		//d) Iterate the String array
		for (int i = 0; i < Array.length; i++) {
			// d.1) add each word into Set
			set.add(Array[i]);
			
		}
		//e) Print the Set values which is having unique words
		System.out.println(set);
		
		
		
		
	}

}
