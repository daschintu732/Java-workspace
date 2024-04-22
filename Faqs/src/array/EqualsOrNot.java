package array;

import java.util.Arrays;

public class EqualsOrNot {

	public static void main(String[] args) {

		int[] a1 = { 1, 4, 7, 2, 9};
		int[] a2 = { 7, 2, 9, 1, 4};

		if(isEqual(a1,a2))
			System.out.println("Arrays are Equal");
		else
			System.out.println("Arrays are not Equal");
	}
	
	public static boolean isEqual(int a1[],int a2[]) 
	{
		int l1 = a1.length;
		int l2 = a2.length;
		
		if(l1 != l2)
			return false;
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		for(int i=0; i<l1; i++)
		{
			if(a1[i] != a2[i])
				return false;
		}
		
		return true;
	}
}
