package basics;

public class GCD {

	public static void main(String[] args) {

		int a = 10;
		int b = 21;

		while (a != 0 && b != 0) {

			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}

		if (a != 0) {
			System.out.println("Greatest Common Divisor is : " + a);
		} else {
			System.out.println("Greatest Common Divisor is : " + b);
		}
	}
}