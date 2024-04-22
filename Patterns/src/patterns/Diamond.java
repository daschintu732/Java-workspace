package patterns;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int input = sc.nextInt();
		sc.close();

		for (int row = 0; row < 2*input; row++) {

			int totalColsInRow = row > input ? 2*input-row : row;

			int noOfSpaces = input - totalColsInRow;
			
			for (int spc = 0; spc < noOfSpaces; spc++) {
				System.out.print(" ");
			}
			for (int col = 0; col < totalColsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
