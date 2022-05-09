package array;
/*Given two non-negative integers low and high.
 *  Return the count of odd numbers between low and high (inclusive).*/

public class countOddInInterval {
	
	public static int countOdd(int low ,int high)
	{
		int count=0;
		for(int i=low;i<=high;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.print(count);
	return count;
	}
	
	public static void main(String args[])
	{
		int low=3;
		int high=7;
		countOddInInterval.countOdd(low,high);
	}

}
