package array;

import java.util.Arrays;

public class SumAndFindTarget {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 7 };
		System.out.println(Arrays.toString(twoSum(arr, 9)));
		
	}

	public static int[] twoSum(int[] arr, int target) {

		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] + arr[i] == target) {

				return new int[] { i, i + 1 };
			}
		}
		return new int[] { -1, -1 };
	}
}
