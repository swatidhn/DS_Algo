package array;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

public class TwoSum {
	private static int[] twoSum(int nums[],int target)
	{
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.print("I"+i+ "J"+ j);
					return new int[]{i,j};
			}
		}
		
	}
		return nums;
	}
	public static void main(String args[]) {
		int arr[] = new int[] { 7, 4, 2, 8 };
		int target=9;
		twoSum(arr,target);
	}

}
