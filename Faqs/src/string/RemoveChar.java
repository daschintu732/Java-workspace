package string;

public class RemoveChar {

	public static void main(String[] args) {

		String str = "MICROSOFT";
		char ch = 'O';
		String finalStr = "";

		for (int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) != ch)
				finalStr += str.charAt(i);
		}
		System.out.println(finalStr);
	}
}
