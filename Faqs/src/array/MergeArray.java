package array;

public class MergeArray {

	public static void main(String[] args) {

		int[] array1 = { 97, 66, 88, 10 };
		int[] array2 = { 4, 5, 6, 36, 55 };

		int mergedLength = array1.length + array2.length;

		int[] mergedArray = new int[mergedLength];

		for (int i = 0; i < array1.length; i++) {
			mergedArray[i] = array1[i];
		}

		for (int i = 0; i < array2.length; i++) {
			mergedArray[array1.length + i] = array2[i];
		}

		System.out.print("Merged Array : ");
		for (int i = 0; i < mergedLength; i++) {
			System.out.print(mergedArray[i] + " ");
		}
	}
}
