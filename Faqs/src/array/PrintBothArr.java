package array;

import java.util.HashSet;
import java.util.Set;

public class PrintBothArr {

	public static void main(String[] args) {

		int[] arr1 = { 24, 78, 52, 80, 61, 13, 90 };
		int[] arr2 = { 17, 59, 13, 78, 24, 78 ,10, 100};

		printUnion(arr1, arr2);// method calling
	}

	static void printUnion(int arr1[], int arr2[]) 
	{
		Set<Integer> s1 = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) 
		{
			s1.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) 
		{
			s1.add(arr2[i]);
		}
		
		System.out.println("Printing Both Array :"+s1);
	}
}
