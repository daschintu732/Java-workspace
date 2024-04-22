package com.dsa;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = { 2, 5, 8, 1, 4 };

		for (int i = 1; i < arr.length; i++) {

			int current = arr[i];
			int sorted = i - 1;

			while (sorted >= 0 && current < arr[sorted]) {

				arr[sorted + 1] = arr[sorted];
				sorted--;
			}
			arr[sorted + 1] = current;
		}
		System.out.println(Arrays.toString(arr));
	}
}
