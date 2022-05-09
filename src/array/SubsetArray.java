package array;

import java.util.HashMap;

public class SubsetArray {
	
	public static void subsetArray(int arr1[], int arr2[])
	{
		HashMap<Integer,Integer> arraymap= new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr1.length;i++)
		{
			arraymap.put(arr1[i],i);
		}
		for(int j=0;j<arr2.length;j++)
		{
			if(!arraymap.containsKey(arr2[j]))
			{
				break;
			}
			else
			{
				System.out.print(" true");
			}
		}
	}
	
	
	public static void main(String args[])
	{
		int a1[] = {11, 1, 13, 21, 3, 7};
		int a2[]= {11, 3, 7, 1};
		subsetArray(a1,a2);
	}

}
