package array;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, 
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 */
public class MergeSortedArray {

	private static void mergeSorted(int num1[], int num2[]) {
		int n = num1.length, m = num2.length;
		int i = n - 1, j = 0;
		int k = 0;
		int temp = 0;
		while (j < m && i >= 0) {
			if (num1[i] > num2[j]) {
				temp = num2[j];
				num2[j] = num1[i];
				num1[i] = temp;

				i--;
				j++;
			} else {
				i--;
				j++;
			}
		}

		while (i < num1.length) {
			System.out.print(num1[i]+" ");
			i++;

		}

		System.out.println();
		while (k< num2.length) {
			System.out.print(num2[k]+" ");
			k++;

		}

	}

	public static void main(String args[]) {
		int arr1[] = new int[] { 1, 5, 9, 10, 15, 20 };
		int arr2[] = new int[] { 2, 3, 8, 13 };
		mergeSorted(arr1, arr2);

	}
}
