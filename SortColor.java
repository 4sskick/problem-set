import java.util.Arrays;

/*
 * given an array with n objects colored red, white, or blue, sort them in-place so that the same colors are adjacent, 
 * with the colors are red white blue
 * 
 * each color is coded by integer number [0, 1, 2] represent red white blue respectively
 * 
 * ex.
 * input: [0,2,1,0,0,2,1]
 * output: [0,0,0,1,1,2,2]
 *
 *  ======================
 *  using brute force could solve the problem as worst case
 *  but thers's an algorithm called Dutch National Flag Algorithm (DNF).
 *  
 *  DNF would be divided by 3 pointer [first, mid, last], 
 *  which: 
 *  - first -> first index (0th)
 *  - mid -> mid index, as initial would be set as 0th like `first`
 *  - last -> last would be an `n length - 1` index
 *  
 *  there would be 3 condition to check at runtime:
 *  - if nums[mid] == 0, then swap(nums[first], nums[mid]) continue with first++ && mid++
 *  - if nums[mid] == 1, then mid++
 *  - if nums[mid] == 2, then swap(nums[last], nums[mid]) continue with last--
 *  - and all of that would wraped into condition loop `mid <= last` 
 *  
 *  from example input above, input: [0,2,1,0,0,2,1]
 *  3 pointers would pointing on value:
 *  - first = 0
 *  - mid = 0
 *  - last = 1
 *  - check on condition explained above, then update
 * @author monta
 *
 */
public class SortColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in = new int[] { 0, 2, 1, 0, 0, 2, 1 };
		int[] out = solution(in);

		System.out.print(Arrays.toString(out));
	}

	static int[] solution(int[] in) {

		int first = 0;
		int mid = 0;
		int last = in.length - 1;

		while (mid <= last) {
			if (in[mid] == 0) {
				swap(in, first, mid);
				first++;
				mid++;
			} else if (in[mid] == 1) {
				mid++;
			} else if (in[mid] == 2) {
				swap(in, last, mid);
				last--;
			}
		}
		
		return in;
	}

	static void swap(int[] in, int a, int b) {
		int temp = in[a];
		in[a] = in[b];
		in[b] = temp;
	}

}
