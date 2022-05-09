package array;

import java.util.HashSet;
import java.util.Set;

/*Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.*/

public class ZeroSumSubArray {
	// Brute Force Approach
	public static void subArrayExists(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum == 0) {
					System.out.print("true  ");
				}
			}

		}

	}
	
	// Modified solution
	public static void subArraymExists(int arr[], int n) {
		
		Set<Integer> hs= new HashSet<Integer>();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			if(sum==0||arr[i]==0||hs.contains(sum))
			{
				System.out.print("true  ");
			}
			hs.add(sum);
		}
	
	}
	

	public static void main(String args[]) {
		int arr[] = new int[] { 4, 2, -3, 1, 6 };
		ZeroSumSubArray.subArrayExists(arr, 5);
		ZeroSumSubArray.subArraymExists(arr,5);
	}
}
