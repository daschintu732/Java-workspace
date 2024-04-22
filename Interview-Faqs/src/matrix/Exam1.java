package matrix;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {

		int arr[][] = new int[4][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 16 number");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		sc.close();
	}
}