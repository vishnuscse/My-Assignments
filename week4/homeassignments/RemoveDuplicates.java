package week4.day1.homeassignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//Declare a String as "PayPal India"
		
		String str = "PayPal India";
		
		//Convert it into a character array
		char[] charArray = str.toCharArray();
		
		System.out.println(charArray);
		
		//Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			charSet.add(charArray[i]);
			
		}
		
		System.out.println("Before removing space: "+charSet);
		
		String output="";
		
		for (Character each : charSet) {
			output = output.replaceAll(" ", "")+each;
			
		}
		
		System.out.println("After removing space: " +output);

	}

}
