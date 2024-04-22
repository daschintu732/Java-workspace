package com.cycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {

	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 6, 4, 5 };
		System.out.println(getAllMissingNumbers(arr));

	}

	static List<Integer> getAllMissingNumbers(int[] arr) {

		/*
		 * int i = 0; while (i < arr.length) { int correct = arr[i] - 1; if (arr[i] !=
		 * arr[correct]) { swap(arr, i, correct); } else { i++; } }
		 */

		int i = 0;
		while (i < arr.length) {

			if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[arr[i] - 1]) {
				swap(arr, i, arr[i] - 1);
			} else {
				i++;
			}
		}
		// Finding missing numbers
		List<Integer> missingNum = new ArrayList<>();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != index + 1) {
				missingNum.add(index + 1);
			}
		}
		return missingNum;
	}

	private static void swap(int[] arr, int first, int second) {

		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}