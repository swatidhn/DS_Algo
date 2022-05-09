
/*You are given an array of unique integers salary where 
 * salary[i] is the salary of the ith employee.

Return the average salary of employees excluding 
the minimum and maximum salary. Answers within 10-5
 of the actual answer will be accepted.*/

public class AvgSalary {

	private static double avgSalary(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int s: arr) {
            min = Math.min(min, s);
            max = Math.max(max, s);
            total += s;
        }
        total -= (min + max);
        System.out.print("AVG  "+total);
        return total * 1.0 / (arr.length - 2);


	}

	public static void main(String args[]) {
		int arr[] = new int[] { 7, 4, 5, 8 };
		avgSalary(arr);
	}

}
