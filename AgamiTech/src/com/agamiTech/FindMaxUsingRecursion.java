package com.agamiTech;

public class FindMaxUsingRecursion {

	public static void main(String[] args) {

		int arr[] = { 11, 2, 55, 122, 987 };
		int result = findMaxValue(arr, 0);
		System.out.println(result);
	}

	static int findMaxValue(int[] arr, int index) {

		if (index == arr.length - 1) {
			return arr[index];
		} else if (arr.length == 0) {
			return 0;
		}

		int max = findMaxValue(arr, index + 1);
		return Math.max(arr[index], max);
		
	}
}