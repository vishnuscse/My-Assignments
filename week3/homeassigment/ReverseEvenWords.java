package week3.homeassigment;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		//Declare the input as Follow
		String test = "I am a software tester";
		System.out.println("Original Text : " +test);
		
		//a) split the words and have it in an array
		String split[] = test.split(" ");
		String val = "";
		
		//b) Traverse through each word (using loop)
		for (int i = 0; i < split.length; i++) {
			
			//c) find the odd index within the loop (use mod operator)
			if ((i%2)!=0) 
				//Using StringBuilder Class - Retrieve the even words(odd index) > reverse the word
				val = val+new StringBuilder(split[i]).reverse()+" ";
			
			else
				val = val+split[i]+ " ";
			
		}
		
				
		System.out.println("Reversed Even Words: " +val);
		

	}
}
