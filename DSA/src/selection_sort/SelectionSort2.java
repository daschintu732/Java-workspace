package selection_sort;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {

		int arr[] = { 41, 76, 53, 96, 50 };
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void selection(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			int last = arr.length - 1 - i;
			int maxIndex = getMaxValue(arr, 0, last);
			swap(arr, maxIndex, last);
		}
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	private static int getMaxValue(int[] arr, int start, int end) {

		int max = start;
		for (int i = start; i <= end; i++) {
			if (arr[max] > arr[i]) {
				max = i;
			}
		}
		return max;
	}
}
