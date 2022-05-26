import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Question: 
 * Write an efficient program for printing k largest elements in an array. 
 * Elements in an array can be in any order.
 * 
 * For example, if the given array is [1, 23, 12, 9, 30, 2, 50] 
 * and you are asked for the largest 3 elements i.e., k = 3 
 * then your program should print 50, 30, and 23.
 * =======================
 * 
 * approach:
 * - use sorting
 * 		- sort the elements in descending order -> O(log(n))
 * 		- print the first k number of elements
 * - 
 */

/**
 * @author monta
 *
 */
public class kLargest {

	public static void main(String[] args) {
		Integer[] input = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
		int k = 3;

		// solution 1
		Solution(input, k);

		// solution 2
		SolutionComparator(input, k);
	}

	private static void Solution(Integer[] in, int k) {

		// when using sort func, should using Integer, primitive type wouldn't do
		Arrays.sort(in, Collections.reverseOrder());

		for (int i = 0; i < k; i++) {
			System.out.print(in[i] + " ");
		}
	}

	@SuppressWarnings("unchecked")
	private static void SolutionComparator(Integer[] in, int k) {

		// convert into list
		List<Integer> inList = Arrays.asList(in);
		Collections.sort(inList, new CustomComparator<Integer>());

		for (int i = 0; i < k; i++)
			System.out.print(inList.get(i) + " ");

	}

}

//class comparator to know how it work
// when it come to sort
class CustomComparator<T extends Comparable<T>> implements Comparator<T> {

	// if want to sort in reverse (biggest to smallest)
	// then could be typed in b.compareTo(a)

	// or when it come to sort from smallest to biggest
	// then type a.compareTo(b)
	@Override
	public int compare(T a, T b) {
		return b.compareTo(a);
	}

}
