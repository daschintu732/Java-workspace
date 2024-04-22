package example1;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 2223902;
		boolean ans = checkPrime(num);
		if (ans == true)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");

	}

	public static boolean checkPrime(int num) {

		int count = 0;

		if (num < 2)
			return true;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0)
				count++;
		}

		if (count > 2)
			return false;

		return true;
	}
}