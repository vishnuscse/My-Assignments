package week1.homeassignment;

public class TwoWheelerClass {
	
	public int noOfWheels() {
		return 2;
	}
	
	public short noOfMirrors() {
		return 2;
	}
	
	public long chassisNumber() {
		return 7645478487l;
	}
	
	public boolean isPunctured() {
		return false;
	}
	
	public String bikeName() {
		return "Bajaj Pulsar 150 DTSi";
	}
	
	public double runningKM() {

		return 3454335d;
	}
	
	public static void main(String[] args) {
		
		TwoWheelerClass tw = new TwoWheelerClass();
		System.out.println("VEHICLE DETAILS:");
		System.out.println("Number of Wheels:" +tw.noOfWheels());
		System.out.println("Number of Mirrors:" +tw.noOfMirrors());
		System.out.println("Vehicle Chassis Number:" +tw.chassisNumber());
		System.out.println("Is Vehicle Punctured:" +tw.isPunctured());
		System.out.println("Bike Model:" +tw.bikeName());
		
	}

}
