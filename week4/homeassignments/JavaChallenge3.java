package week4.day2.homeassignments;

public class JavaChallenge3 {

	public static void main(String[] args) {
		
	
		//Input String
		String input = "race a car";
		
		//converting to lower case
		String lowerCase = input.toLowerCase();
		System.out.println(lowerCase);
		
		//Removing Special Characters
		String replaceAll = lowerCase.replaceAll(",", "");
		String replaceAll2 = replaceAll.replaceAll(" ", "");
		String replaceAll3 = replaceAll2.replaceAll(":", "");
		System.out.println("Given String");
		System.out.println(replaceAll3.toString());
		char[] charArray = replaceAll3.toCharArray();
		
		String rcharArray = "";
		  
		for (int i = charArray.length-1; i>=0; i--) {
		rcharArray = rcharArray+charArray[i];
		
		}
		
		System.out.println("Reversed String:" +rcharArray);
		if (rcharArray.equals(replaceAll3)) {
			System.out.println("This is Palindrome");
			
		}
		
		else {
			System.out.println("This is not Palindrome");
		}
		

	}

}
