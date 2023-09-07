package week3.homeassigment;

public class BankInfo {
	
	public void saving() {
		System.out.println("Savings --> From BankInfo");
	}
	
	public void fixed() {
		System.out.println("Fixed Deposits --> From BankInfo");
	}
	
	public void deposit() {
		System.out.println("General Deposits --> From BankInfo");
	}

	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();

	}

}
