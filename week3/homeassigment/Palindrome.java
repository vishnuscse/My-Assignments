package week3.homeassigment;

public class Palindrome {

	public static void main(String[] args) {
		// a) Declare A String value as"madam"
		
		String s = "madam";
		
		//b) Declare another String rev value as ""
		String rs = "";
		
		//c) Iterate over the String in reverse order
		
		
		for (int i = s.length()-1; i >= 0; i--) {
			rs=rs+s.charAt(i);
		}
		
		System.out.println(rs);
		
		//e) Compare the original String with the reversed String, if it is same then print palinDrome 
		
		if (rs.equals(s)) {
			System.out.println("The given String is a Palindrome");
		}
		
		else {
			System.out.println("The given String is NOT a Palindrome");
		}
	}
}

