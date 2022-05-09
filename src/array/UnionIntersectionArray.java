package array;


import java.util.HashMap;
import java.util.HashSet;

/*Given two arrays a[] and b[] of size n and m respectively. 
The task is to find union between these two arrays.
Union of the two arrays can be defined as the set containing 
distinct elements from both the arrays. If there are repetitions, 
then only one occurrence of element should be printed in the union.*/
public class UnionIntersectionArray {
	
	// union
	public static void union(int a[], int b[])
	{
		int m=a.length,n=b.length;
		HashSet<Integer> set= new HashSet<Integer>();
		for(int i=0;i<m;i++)
		{
			set.add(a[i]);
		}
		
		for(int j=0;j<n;j++)
		{
			set.add(b[j]);
		}
		System.out.print("size  "+ set.size() );
		
	}
	
	// Intersection
	public static void intersection(int a[], int b[])
	{
		int count=0;
	HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++)
        {
        	map.put(a[i],i);
        }
        
        for(int j=0;j<b.length;j++)
        {
        	if(map.containsKey(b[j]))
        	{
        		count++;
        	}
        	
        	else
        	{
        		map.put(b[j],j);
        	}
        	
        	
        }
        System.out.println("count  "+count );
	}
	
	public static void main(String args[]) {
		int arr[] = new int[] { 85, 25,1, 32, 54,6 };
		int arr1[]= new int[] {85,2,25};
		union(arr,arr1);
		intersection(arr,arr1);
		
	}

}
