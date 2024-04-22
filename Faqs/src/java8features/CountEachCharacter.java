package java8features;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacter {

	public static void main(String[] args) {

		String name = "JavaDeveloper";
		System.out.println(name);
		name = name.toLowerCase();

		Map<String, Long> maps = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(maps);
	}
}