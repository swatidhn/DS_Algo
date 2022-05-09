package array;

import java.util.Arrays;

public class KthSmallest {
	
	public static void kthMaxMinArray(int arr[], int k)
	{
		Arrays.sort(arr);
		System.out.println("Kth Smallest  "+arr[k-1]);
	}
	
	public static void main(String args[])
	{
		int arr[]= new int[] {4,6,9,1,3,2,7};
		int k=5;
		kthMaxMinArray(arr,k);
	}

}
