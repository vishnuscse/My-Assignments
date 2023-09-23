package week5.day2.homeassignments;

import java.util.Arrays;

public class JavaChallenge6 {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2,1,1};
		Arrays.sort(nums);
		System.out.println("Sorted Array:");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("Length of the given Array: " +nums.length);
		
		int mid = (nums.length)/2;
		System.out.println("N/2 of the Given Array:" +mid);
		
		for (int i = nums[0]; i < nums.length; i++) {
			if (i>mid) {
				System.out.println("Majority Appeared Number is: " +nums[i]);
				break;
			}
			else {
				nums[i]++;
			}
			
		}
		
		

	}

}
