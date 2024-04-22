package patterns;

import java.util.Scanner;

public class DiamondNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int input = sc.nextInt();
		sc.close();

		for (int row = 0; row <= 2 * input; row++) {

			int colsInRow = row > input ? 2 * input - row : row;

			for (int spaces = 0; spaces < input - colsInRow; spaces++) {
				System.out.print("  "); //Increase the spaces and see magic
			}

			for (int col = colsInRow; col >= 1; col--) {
				System.out.print(col + " ");
			}

			for (int col = 2; col <= colsInRow; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
