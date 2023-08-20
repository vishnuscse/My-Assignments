package week1.day2;

public class Calculator {

		
		private int addTwoNumbers(int num1, int num2)
		{
		return num1+num2;
		}
		
		public float mulTwoNumbers(float num1, int num2)
		{
		return num1*num2;
		}
		
		public int subTwoNumbers(int num1, int num2)
		{
			return num1-num2;
			
		}
		
	public static void main(String[] args) {
		
		Calculator cl = new Calculator();
		System.out.println(cl.addTwoNumbers(2, 3));
	}	
}

