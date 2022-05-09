package array;
import java.util.*;
public class FindMaxMinArray {
	public static void findMaxMinArray(int arr[])
	{
		Arrays.sort(arr);
		int size= arr.length;
		int min=arr[0];
		int max=arr[size-1];
		System.out.print("Minimum "+ min + "maximum "+ max);
		
	}
	public static void main(String args[]) {
		int arr[] = new int[] { 7, 4, 5, 8 };
		findMaxMinArray(arr);
	}


}
