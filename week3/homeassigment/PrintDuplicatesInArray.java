package week3.homeassigment;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		// get the length of the array
		int length = arr.length;
		System.out.println("The Array Length is: " +length);
		
		//printing the given array:
		System.out.println("The Given Array is:");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);
			
		}
		
		// declare an int variable named count
		
		System.out.println("Duplicate Values in the Given Array are:");
		//// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arr.length-1; i++) {
			
			// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
			for (int j = i+1; j < arr.length; j++) {
				// compare both the loop variables & check they're equal
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
			
		}

	}

}
