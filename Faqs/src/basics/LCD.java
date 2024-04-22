package basics;

// Least Common Denominator
public class LCD {

	public static void main(String[] args) {

		int a = 12;
		int b = 50;
		int ans = findLcd(a, b);
		System.out.println("The LCD of " + a + " and " + b + " is: " + ans);
	}

	private static int findLcd(int num1, int num2) {

		int max = Math.max(num1, num2);
		int Lcd = max;

		while (true) {
			if (Lcd % num1 == 0 && Lcd % num2 == 0) {
				break;
			}
			Lcd = Lcd + max;
		}
		return Lcd;
	}
}