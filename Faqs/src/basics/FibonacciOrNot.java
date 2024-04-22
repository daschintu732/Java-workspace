package basics;

public class FibonacciOrNot {

	public static void main(String[] args) {

		int num = 10;
		if (isFibonacci(num)) {
			System.out.println(num + " is a Fibonacci Number");
		} else {
			System.out.println(num + " is not a fibonacci Number");
		}
	}
	static boolean isFibonacci(int number) {

		int first = 0;
		int second = 1;
		
		while (second < number) 
		{
			int temp = first+second;
			first = second;
			second = temp;
		}
		return second == number;
	}
}
