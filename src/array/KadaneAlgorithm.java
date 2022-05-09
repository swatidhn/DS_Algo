package array;

public class KadaneAlgorithm {

	public static void maxmSumArray(int arr[]) {
		int max = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			max = Math.max(sum, max);
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.print("Max  " + max);
	}
	
	
	public static void maxnegSumArray(int arr[])
	{
		int max=Integer.MIN_VALUE;;
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			max = Math.max(sum, max);
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.print("Max  " + max);
			
	}
	public static void main(String args[]) {
		int arr[] = new int[] { -1,-2,5,-4 };
		maxmSumArray(arr);
		maxnegSumArray(arr);
		
	}
}
