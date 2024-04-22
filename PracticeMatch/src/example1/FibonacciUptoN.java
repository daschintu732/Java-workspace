package example1;

public class FibonacciUptoN {

	public static void main(String[] args) {

		int num = 5;
		fibo(num);
	}

	private static void fibo(int num) {

		int first = 0, second = 1;

		for (int i = 0; i < num; i++) {
			System.out.println(first);

			int temp = first + second;
			first = second;
			second = temp;
		}
		System.out.println(second);
	}

}
