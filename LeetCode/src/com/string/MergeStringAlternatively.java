package com.string;

public class MergeStringAlternatively {

	public static void main(String[] args) {

		String word1 = "Development";
		String word2 = "Java";

		StringBuffer result = new StringBuffer();
		int index = 0;

		while (index < word1.length() || index < word2.length()) {

			if (index < word1.length()) {
				result.append(word1.charAt(index));
			}
			if (index < word2.length()) {
				result.append(word2.charAt(index));
			}
			index++;
		}
		System.out.println(result.toString());
	}
}
