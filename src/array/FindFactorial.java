package array;

public class FindFactorial {
	
	public static long findFactorial(int number)
	{
		long factorial=0;
		if(number==0||number==1)
		{
			return 1;
		}
		else
		{
			factorial= number*findFactorial(number-1);
			System.out.println("Factorial" + factorial);
			return factorial;
			
		}
		
	}
	public static void main(String args[]) {
		int n=5;
		FindFactorial.findFactorial(n);
		
	}

}
