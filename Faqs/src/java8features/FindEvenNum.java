package java8features;

import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNum {

	public static void main(String[] args) {

		List<Integer> list = List.of(2, 5, 4, 7, 9, 3, 5, 7);
		List<Integer> even = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
	}
}
