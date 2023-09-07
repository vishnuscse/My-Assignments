package week3.homeassigment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//* Declare String Input as Follow
		String test = "changeme";
		
		// a) Convert the String to character array
		char[] charArray = test.toCharArray();
		
		
		//b) Traverse through each character (using loop)
		for (int i = 1; i < charArray.length; i++) {
			
			//c)find the odd index within the loop (use mod operator)
			if( i%2 == 1) {
				
				// d)within the loop, change the character to uppercase, if the index is odd else don't change
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
			
		}
		System.out.println("Coverted String: ");
		System.out.print(charArray);

	}

}
