package array;
// sort 0's, 1's,2's
public class SortZeroes {
	
	public static void sortzeroes(int arr[])
	{
	   int count0=0,count1=0,count2=0;
	   
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]==0)
			  count0++;
		  if(arr[i]==1)
			  count1++;
		  if(arr[i]==2)
			  count2++;
	  }
		  for(int i=0;i<count0;i++)
		  {
			  arr[i]=0;
		  }
		  
		  for(int i=count0;i<count0+count1;i++)
		  {
			  arr[i]=1;
		  }
		  
		  for(int i=count0+count1;i<count0+count1+count2;i++)
		  {
			  arr[i]=2;
		  }
		  
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]);
		  }
	  
	}
	
	public static void main(String args[])
	{
		int arr[]= new int[] {0,2,2,1,0,0,1};
		sortzeroes(arr);
		
	}

}
