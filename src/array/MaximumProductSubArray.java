package array;

public class MaximumProductSubArray {
	
	public static void maxmProductSubArray(int arr[])
	{
		int maxmProduct=0;
		int product=1;
		for(int i=0;i<arr.length;i++)
		{
			
			product = product*arr[i];
		    maxmProduct= Math.max(product, maxmProduct);
		   
		}
		 System.out.println(maxmProduct);
	}
	public static void main(String args[]) {
		int arr[] = new int[] { 2, 3, 4, 5, -1, 0 };
		maxmProductSubArray(arr);
		
		
	}

}
