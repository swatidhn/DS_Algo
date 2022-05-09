package array;

// print number which appeared more than n/k times
public class MooreVotingAlgorithm {
	
	public static void mooreVotingAlgorith(int arr[], int k)
	{
		
		int count=0;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(count==0)
			{
				index=1;
				count=1;
			}
			else
			{
				if(count==index)
					count++;
				else
					count--;
			}
			
		}
		
		for (int j = 0; j < arr.length; j++) {
		      if (arr[j] == index)
		        count++;
		    }
		    if (count > (arr.length / k))
		     System.out.print("Index " + index);
	}
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 1, 2, 2, 3, 5, 4,
                2, 2, 3, 1, 1, 1 };
int n = 12;
int k = 4;
		mooreVotingAlgorith(arr,k);
		
		
	}

}
