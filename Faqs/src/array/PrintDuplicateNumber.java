package array;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumber {

	public static void main(String[] args) {

		int[] arr1 = { 24, 78, 52, 80, 61, 13, 90 };
		int[] arr2 = { 17, 59, 13, 78, 24, 78 };

		printIntersection(arr1, arr2);// method calling
	}

	static void printIntersection(int arr1[], int arr2[]) 
	{
		Set<Integer> s1 = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) 
		{
			s1.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) 
		{
			if (s1.contains(arr2[i]))
				System.out.print(arr2[i]+" ");
		}
	}
}
