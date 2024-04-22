package string;

public class ReverseString {

	public static void main(String[] args) {

		//By using String
		String str = "JAVA";
		for (int i = str.length()-1; i >= 0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
		//By using StringBuffer
		System.out.println();
		String original = "JAVASE";
		StringBuffer sb = new StringBuffer(original);
		sb.reverse();
		System.out.println(sb);

	}
}
