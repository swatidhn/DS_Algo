package array;
// [1,3,4,2,2]

import java.util.Arrays;

public class findDuplicate {
	
	public static void findDuplicate(int nums[])
	{
		int[] freq = new int[nums.length];
	    int i=0;
	    for(i=0 ; i<nums.length ; i++){
	        freq[nums[i]]++;
	        
	        if(freq[nums[i]] == 2)
	            System.out.print(nums[i]);
	    }
	    
	    
	
	}
	public static void main(String args[]) {
		int arr[] = new int[] { 3,1,3,4,2 };
		findDuplicate(arr);
		
		
	}

}
