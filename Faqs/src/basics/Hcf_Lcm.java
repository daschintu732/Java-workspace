package basics;

public class Hcf_Lcm {

	public static void main(String[] args) {

		/*
		 * int a = 15; int b = 2012; int Hcf = findHcf(a, b); System.out.println(Hcf);
		 */

		int[] arr = { 45, 21, 43, 18, 9, 33 };
		int Lcm = findLcm(arr, 0);
		System.out.println(Lcm);

	}

	private static int findLcm(int[] arr, int index) {

		if (index == arr.length) {
			return index;
		}

		int a = arr[index];
		int b = findLcm(arr, index + 1);

		return (a * b) / findHcf(a, b);
	}

	private static int findHcf(int a, int b) {

		if (a == 0 || b == 0) {
			return 0;
		}
		while (a != 0 && b != 0) {

			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}
	}
}