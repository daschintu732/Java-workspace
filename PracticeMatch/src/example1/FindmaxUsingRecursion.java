package example1;

public class FindmaxUsingRecursion {

	public static void main(String[] args) {

		int[] arr = { 23, 45, 64, 14, 37, 48 };
		System.out.println(findMax(arr, 0));
	}

	private static int findMax(int[] arr, int index) {

		if (index == arr.length - 1) {
			return arr[index];
		} else if (arr.length == 0) {
			return 0;
		}

		int max = findMax(arr, index + 1);

		return Math.max(max, arr[index]);

	}
}
