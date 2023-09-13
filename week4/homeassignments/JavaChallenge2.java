package week4.day2.homeassignments;

public class JavaChallenge2 {

	public static void main(String[] args) {
		
		//Input
		int input = 120;
		
		//finding the square root
		
		for (int i = 1; i < 12; i++) {
		
			if ((i*i)> input) {
				System.out.println("The Nearest Square Root value is:" +(i-1));
				break;
			}
			
		}
		

	}

}
