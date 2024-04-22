package string;

public class MergeStringAlternatively {

	public static void main(String[] args) {

		String st1 = "bike";
		String st2 = "mobiles";
		mergeAlternately(st1, st2);
	}

	static void mergeAlternately(String word1, String word2) 
	{

		StringBuilder results = new StringBuilder();
		int i = 0;

		while (i < word1.length() || i < word2.length()) 
		{
			if(i < word1.length()) {
				results.append(word1.charAt(i));
			}
			if(i < word2.length()) {
				results.append(word2.charAt(i));
			}
			i++;
		}
		System.out.println(results.toString());
	}
}
