package week1.homeassignment;

public class IsPrime {

	public static void main(String[] args) {
		
		int a=19;
		int flag=0;
		System.out.println("The given number is:" +a);
		
		if (a==1) {
			System.out.println("This is NOT a Prime Number");
		}
		
		for (int i = 2; i<=a/2; i++) {
			
			if(a%i==0) {
				flag++;
					
			}
		
			if (flag>=1) {
				System.out.println("This is NOT a Prime Number");
				break;
				
			}
			else {
				System.out.println("This is a Prime Number");
				break;
			}
		}
			

	}

}
