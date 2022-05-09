package array;
import java.util.HashMap;

/*
 * Given an integer array nums, return true if any value appears
 *  at least twice in the array, and return false if every element is distinct.
 */
public class DuplicateInArray {
	private static boolean duplicate(int arr[])
	{
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
	   for(int i=0;i<arr.length;i++)
	   {
		if(map.containsValue(arr[i]))
		{
			
			return true;
		}
		else
		{
			map.put(i,arr[i]);
		}
	   }
		return false;
		
	}
	public static void main(String args[]) {
		int arr[] = new int[] { 7, 4, 2, 8 };
		duplicate(arr);
	}

	// second logic
	
	/* boolean foundDublicate = false;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) return true;
        }
        return false;*/
}
