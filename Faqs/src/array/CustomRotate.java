package array;

import java.util.Arrays;

public class CustomRotate {

	public static void main(String[] args) {

		int[] nums = { 4, 7, 3, 9, 1 };
		int k = 3;

		rotate(nums, k);

	}

	public static void rotate(int[] nums, int k) {

		
		k = k % nums.length; //Ensure k is within array bounds
		
		// Reverse all elements
		reverseArray(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
		
		// Reverse first k elements
		reverseArray(nums, 0, k - 1);
		System.out.println(Arrays.toString(nums));
		
		// Reverse remaining elements
		reverseArray(nums, k, nums.length - 1);
		System.out.println(Arrays.toString(nums));

		
	}

	public static void reverseArray(int nums[], int start, int end) {

		while (start < end) {

			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;

			start++;
			end--;
		}
	}

}