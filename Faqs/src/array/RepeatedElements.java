package array;

import java.util.Arrays;

public class RepeatedElements {

	public static void main(String[] args) {

		int nums[] = { 2, 6, 1, 2, 9, 6, 3 };

		Arrays.sort(nums);
		int n = nums.length;
		System.out.println(nums[n / 2]);
		//wrong solution
	}
}
