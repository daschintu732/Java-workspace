package patterns;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int input = sc.nextInt();
		sc.close();

		for (int row = 0; row <= input; row++) {

			for (int spaces = 0; spaces < input - row; spaces++) {
				System.out.print("  ");
			}

			for (int col = row; col >= 1; col--) {
				System.out.print(col+" ");
			}

			for (int col = 2; col <= row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
