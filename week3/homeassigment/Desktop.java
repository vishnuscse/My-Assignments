package week3.homeassigment;

public class Desktop implements Computer {
	
	public void desktopSize() {
		
		System.out.println("Desktop Size is 32' Inch");
	}
	
	@Override
	public void computerModel() {
		System.out.println("Computer Model is Dell Inspiron i512");
		
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();

	}

	

}
