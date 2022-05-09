package array;

public class BuySellStock2 {
	
public static void buySell(int arr[])
{
	int profit=0;
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>arr[i-1])
		{
			profit= profit+(arr[i]-arr[i-1]);
		}
	}
	
	System.out.print("Profit "+ profit);
	
}
public static void main(String args[])
{
	int price[] = { 2, 30, 15, 10, 8, 25, 80 };
	BuySellStock2.buySell(price);
}

}
