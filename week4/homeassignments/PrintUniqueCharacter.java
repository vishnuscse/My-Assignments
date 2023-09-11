package week4.day1.homeassignments;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		//a) Take your name as input
		
		String name = "Kanchana";
		
		//a) Convert String to Character array
		char[] charArray = name.toCharArray();
		System.out.println(charArray[1]);
		
		//b) Create a new Set -> HashSet
		Set<Character> set = new HashSet<>();
		
		//c) Add each character to the Set and if it is already there, remove it
		for (int i = 0; i < charArray.length-1; i++) {
			
			if (set.contains(charArray[i])) {
				
				set.remove(charArray[i]);
				
			}
			//set.add(charArray[i]);
			else {
				set.add(charArray[i]);
			}
			
		}
		
		//d) Finally, print the set
		System.out.println(set);
		
		

	}

}
