package basics;

import java.util.Scanner;

public class FibonacciUptoN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a = 0;
		int b = 1;
		System.out.print(a+" ");
		sc.close();

		if (n > 1) {

			for (int c = 2; c <= n; c++) {

				System.out.print(b + " ");
				int temp = b;
				b = a + b;
				a = temp;
			}
			System.out.println();
		}
	}
}
