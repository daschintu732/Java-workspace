package string;

public class CountString {

	public static void main(String[] args) {
		
		int count=0;
		String s="Java Developer";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
				count++;
		}
		System.out.println(count);
	}
}
