package patterns;

import java.util.Scanner;

public class SquareHome2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int input = sc.nextInt();
		sc.close();
		int originalNum = input;
		input = 2 * input;

		for (int row = 0; row <= input; row++) {

			for (int col = 0; col <= input; col++) {

				int atEvertIndex = originalNum - Math.min(Math.min(row, col), Math.min(input-row, input-col));
				System.out.print(atEvertIndex + " ");
			}

			System.out.println();
		}
	}
}
