package week3.homeassigment;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Displaying Single Argument(ID) Student Info");
		System.out.println("Student ID:" +id);
		System.out.println("-----------------------------------------------");
		
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Displaying Double Argument(ID,Name) Student Info");
		System.out.println("Student ID:" +id);
		System.out.println("Student Name:" +name);
		System.out.println("-----------------------------------------------");
	}
	
	public void getStudentInfo(String email, long phone) {
		System.out.println("Displaying Double Argument(Email, Phone Number) Student Info");
		System.out.println("Student Email ID:" +email);
		System.out.println("Student Phone Number:" +phone);
		System.out.println("-----------------------------------------------");
	}
	
	public static void main(String[] args) {
		
		Students s = new Students();
		s.getStudentInfo(123);
		s.getStudentInfo(143, "Vishnu Vardhan");
		s.getStudentInfo("vishnuscse@gmail.com", 9952082566l);
		
	}
}
