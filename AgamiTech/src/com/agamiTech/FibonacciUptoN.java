  package com.agamiTech;

public class FibonacciUptoN {
	public static void main(String[] args) {

		int n = 8;
		for (int i = 0; i < n; i++) {
			System.out.println(fibo(i));
		}
	}

	static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibo(n - 1) + fibo(n - 2);
	}
}