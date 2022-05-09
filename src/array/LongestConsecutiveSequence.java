package array;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	//Brute force o(n3)
	public static void longestConsecutiveSequence(int arr[])
	{
	    int long_length=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	int currentElement=arr[i];
	    	int currentlength=1;
	    	while(numberExists(arr,currentElement+1))
	    	{
	    		currentElement++;
	    		currentlength++;
	    	}
	    	long_length=Math.max(long_length, currentlength);
	    	
	    }
	}
	
	private static boolean numberExists(int arr[], int nums)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==nums)
			{
				return true;
			}
		}
		return false;
	}



//optimal Solution
	/*Steps:-
	 * add all numbers to hashset
	 * if we found smallest number of the sequence then loop through array find other
	 */
	
public static void longestConsecutiveSequenceOptimal(int arr[])
{
	HashSet<Integer> numset= new HashSet<Integer>();
	
	for(int ar: arr)
	{
		numset.add(ar);
		int long_length=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	int currentElement=arr[i];
	    	int currentlength=1;
	    	if(!numset.contains(currentElement-1))
	    	{
	    		while(numset.contains(currentElement+1))
	    		{
	    			currentElement++;
		    		currentlength++;
	    		}
	    		long_length=Math.max(long_length, currentlength);
	    	}
	}
}
}
}