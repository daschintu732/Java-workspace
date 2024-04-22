package com.cycleSort;

public class FindMissingNum {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 3, 2, 5 };
		System.out.println(cycleSort(arr));
	}

	static int cycleSort(int[] arr) {

		int i = 0;
		while (i < arr.length) {
			int correct = arr[i];
			if (arr[i] < arr.length && arr[i] != arr[correct]) {
				swap(arr, i, correct);
			} else {
				i++;
			}
		}
		// searching for missing number
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index) {
				return index;
			}
		}
		return arr.length;
	}

	static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
