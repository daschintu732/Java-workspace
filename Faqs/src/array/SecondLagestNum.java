package array;

public class SecondLagestNum {

	public static void main(String[] args) {
		int[] arr = { 40, 2, 4, 8, 45, 89, 98,100 };
		System.out.println(findSecondLargestNum(arr));
	}
	private static int findSecondLargestNum(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length - 4];
	}
}
