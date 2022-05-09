package array;

/*
 * Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4
 */
public class CyclicalRotationByOne {
	 static void cyclicalRotation(int arr[])
	{
		  int index=arr.length-1,curr=arr[index],i;
	       for(i=arr.length-1;i>0;i--)
	       {
	           arr[i]=arr[i-1];
	       }
	      arr[i]=curr;  
	      for(i=0;i<arr.length-1;i++)
	      {
	    	  System.out.println(arr[i]);
	      }
		
	}
	public static void main(String args[]) {
		int arr[] = new int[] { 85, 25,1, 32, 54,6 };
		cyclicalRotation(arr);
		
		
	}

}
