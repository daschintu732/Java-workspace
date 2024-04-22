package com.dsa;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 3, 8, 5, 9, 1, 4 };

		for (int i = 0; i < arr.length - 1; i++) {

			int smallest = i;
			for (int j = 1 + i; j < arr.length - 1; j++) {

				if (arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
