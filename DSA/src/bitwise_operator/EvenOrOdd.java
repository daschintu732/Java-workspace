package bitwise_operator;

public class EvenOrOdd {

	public static void main(String[] args) {
		int num = 421;

		if ((num & 1) == 1) // here i am using AND operator
		{
			System.out.println(num + " is a Odd Number");
		} else {
			System.out.println(num + " is a Even Number");
		}
	}
}
