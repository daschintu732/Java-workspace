package array_basics;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Dynamic 3D array
		System.out.print("Enter no of schools : ");
		int[][][] arr = new int[sc.nextInt()][][];

		System.out.print("Enter no of class in each school : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new int[sc.nextInt()][];
		}

		System.out.println("Enter no of student in each class : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = new int[sc.nextInt()];
			}
		}
		System.out.println("Enter the roll no of each student : ");
		// storing data into array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

		// Retrieving data from array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {

					System.out.print(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		sc.close();
	}
}

/*
 * // Dynamic 2D Array int[][] arr = new int[3][]; arr[0] = new int[2]; arr[1] =
 * new int[4]; arr[2] = new int[1];
 * 
 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
 * j++) {
 * 
 * arr[i][j] = sc.nextInt(); } } for (int i = 0; i < arr.length; i++) { for (int
 * j = 0; j < arr[i].length; j++) {
 * 
 * System.out.print(arr[i][j] + " "); } System.out.println(); }
 */