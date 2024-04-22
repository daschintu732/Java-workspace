package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// Approach 1
		String str = "JavaEE";
		StringBuilder sb = new StringBuilder();
		str.chars().distinct().forEach(x -> sb.append((char) x));
		System.out.println(sb);

		// Approach 2
		String name = "SpringBoot";
		StringBuilder sb2 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		
		for (int i = 0; i < name.length(); i++) {
			set.add(name.charAt(i));
		}
		for(char ch : set) {
			sb2.append(ch);
		}
		System.out.println(sb2);
	}
}
