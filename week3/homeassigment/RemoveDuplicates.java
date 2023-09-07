package week3.homeassigment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		//a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		
		// b) Initialize an integer variable as count
		int count = 0;
		
		//c) Split the String into array and iterate over it 
		String[] split = text.split(" ");
		String val = "";
		
		System.out.println("Given String:" +text);
		System.out.println("Given String Converted to Array: [" +split+ "]" );
		System.out.println("Displaying the String without duplicate words : ");
		
		//Iterate the splited array string
		for (int i = 0; i < split.length; i++) {
			
			//Initialize another loop to check whether the word is there in the array
			for (int j = i+1; j < split.length; j++) {
				
				//check whether the word is repeated in the array
				if (split[i].equals(split[j])) {
					//increase by count 1 if it is available
					count=count+1;
					
					//if the count > 1 then replace the word as "" 
					if (count>1) {
						val = text.replace(split[i], "");
						break;
						
					}
					
					
				}
				
			}
			
			
		}
		System.out.println(val);
		}
		
		
		
		
		
		

	}

