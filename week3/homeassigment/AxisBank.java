package week3.homeassigment;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Special Deposits --> From AxisBank Class");
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		//Override Method Call
		a.deposit();
		//Normal Method Call from Another Class
		a.saving();
		a.fixed();
	}

}
