package week1.homeassignment;

public class ConvertNegativeNumber {

	public static void main(String[] args) {
		
		int number=-51;
		int positive;
		
		
		if (number<0) {
			System.out.println("The given Negative Number is:" +number);
			positive = +number *-1;
			System.out.println("The Positive Value of given Negative Number is:" +positive);
			
		}
		
		else if (number == 0) {
			System.out.println("Enter a Valid Negative Number");
			
			
		}
		
		else {
			System.out.println("Enter a Valid Negative Number");
		}

	}

}
