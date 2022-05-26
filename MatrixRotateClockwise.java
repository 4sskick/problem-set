import java.util.Arrays;

/*
 * given a n x n 2D matrix representing an image, 
 * rotate the image by 90 degrees (clockwise)
 * 
 * you have to to rotate the image in-place, which means you have to modify the input 2D matrix existing
 * DO NOT allocate another 2D matrix and do the rotation
 * 
 * ex.
 * input: [
 * 	[1,2,3],
 * 	[4,5,6],
 * 	[7,8,9]
 * ]
 * 
 * output: [
 * 	[7,4,1],
 * 	[8,5,2],
 * 	[9,6,3]
 * ]
 * 
 * ===================
 * approach using brute force could be solution by
 * take the existing matrix and hold one row [1,2,3] 
 * then move it to new matrix as column 
 * 	[ , ,1]
 * 	[ , ,2]
 *	[ , ,3]
 *
 *	doing the same with other rows.
 *	
 *	time complexity: O(N^2)
 *	space complexity: O(N^2) --> because it create the new matrix
 *
 *	BUT, this approach is not allowed
 *
 *	===================
 *	another approach could be
 *	- transposing the matrix
 *	- then reversing values on rows
 *
 * ex.
 * input: [
 * 	[1,2,3],
 * 	[4,5,6],
 * 	[7,8,9]
 * ]
 * 
 * Transpose matrix:
 * input: [
 * 	[1,4,7], --> reverse be [7,4,1]
 * 	[2,5,8], --> reverse be [8,5,2]
 * 	[3,6,9]  --> reverse be [9,6,3]
 * ]
 * 
 * 
 */
public class MatrixRotateClockwise {

	public static void main(String[] args) {
		int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Solution(input);
	}

	private static void Solution(int[][] input) {

		int size = input.length;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < i; j++) {
				swap(input, i, j, input[i][j], input[j][i]);
			}
		}
		// expected: {{1,4,7} {2,5,8}, {3,6,9}}

		for (int i = 0; i < size; i++) {
			reverse(input);
		}
		// expected: {{7,4,1} {8,5,2}, {9,6,3}}

//		System.out.print(Arrays.toString(input));
	}

	private static void reverse(int i) {
		System.out.print(i);
		
	}

	private static void reverse(int[][] arr) {
		int m = arr.length;
	    int n = arr[0].length;

	    for(int i=0; i<m/2; i++)
	        for(int j=0; j<n; j++)
	            swap(arr[i], j, arr[m-1-i], n-1-j);
	    
	    if(m % 2 == 1) 
	    {
	        int[] mid = arr[m/2];
	        for(int j=0; j<n/2; j++)
	            swap(mid, j, mid, n-1-j);
	    }
	    
	    System.out.print(Arrays.toString(arr));
	}

	private static void swap(int[] a, int i, int[] b, int j) {
		int tmp = a[i];
	    a[i] = b[j];
	    b[j] = tmp;
	}

	private static void swap(int[][] is, int i, int j, int input, int input2) {
		is[i][j] = input2;
		is[j][i] = input;
	}

}
