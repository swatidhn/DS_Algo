package array;

import java.util.*;
public class TripletSumToNumber {
	
	boolean find3Numbers(int A[],  int sum)
	{
		Arrays.sort(A);
		 for (int i = 0; i < A.length - 2; i++) {
			 int l = i + 1;
			 int r = A.length - 1;
			 while (l < r) {
	                if (A[i] + A[l] + A[r] == sum) {
	                    System.out.print("Triplet is " + A[i] + ", " + A[l] + ", " + A[r]);
	                    return true;
	                }
	                else if (A[i] + A[l] + A[r] < sum)
	                    l++;
	 
	                else 
	                    r--;
	            }
	        }
	 
	        
	        return false;
	    }
	 public static void main(String[] args)
	    {
		 TripletSumToNumber triplet = new TripletSumToNumber();
	        int A[] = { 1, 4, 45, 6, 10, 8 };
	        int sum = 22;
	        triplet.find3Numbers(A, sum);
		
	}
}


