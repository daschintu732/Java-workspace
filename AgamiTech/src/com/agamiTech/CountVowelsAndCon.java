package com.agamiTech;

public class CountVowelsAndCon {

	public static void main(String[] args) {

		String input = "Data Structure and Algorithm";
		String vowel = "AEIOUaeiou";
		int vowels = 0;
		int consonants = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z' || input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {

				if (vowel.indexOf(input.charAt(i)) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + consonants);
	}
}