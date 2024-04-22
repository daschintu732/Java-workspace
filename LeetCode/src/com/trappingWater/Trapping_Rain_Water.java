package com.trappingWater;

/*
 * Program on Trapping Rain Water by Chin2 ...!!!
 */
public class Trapping_Rain_Water {
	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		trappingWater(arr); // Method calling
	}

	private static void trappingWater(int[] arr) {

		int result = 0;
		int len = arr.length;
		int[] left = new int[len];
		int[] right = new int[len];

		// checking for maximum value from left side
		left[0] = arr[0];
		for (int i = 1; i < len; i++) {

			left[i] = Math.max(arr[i], left[i - 1]);
		}

		// checking for maximum value from right side
		right[len - 1] = arr[len - 1];
		for (int i = len - 2; i >= 0; i--) {

			right[i] = Math.max(arr[i], right[i + 1]);
		}

		// calculating unit of trapping water
		for (int i = 0; i < arr.length; i++) {

			result = result + (Math.min(left[i], right[i]) - arr[i]);
		}
		// final result
		System.out.println(result);
	}
}