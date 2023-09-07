package week3.homeassigment;

public class Student implements College,Department {

	
	@Override
	public void deptName() {
		System.out.println("Department Name: Computer Science and Engineering");
		
	}

	@Override
	public void collegeName() {
		System.out.println("College Name: RMK Engineering College");
		
	}

	@Override
	public void collegeCode() {
		System.out.println("College Code: 113");
		
	}

	@Override
	public void collegeRank() {
		System.out.println("College Rank: 1");
		
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();

	}

	

}
