import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeondLargestNumber {

	public static void main(String[] args) {
		// given an array
		Integer[] data = new Integer[] { 3, 5, 1, 2, 7, 8 };

//		Solution(data);
		Solution_1(data);
	}

	private static void Solution(Integer[] data) {
		// look for second largest number on list

		System.out.println("before sort");
		for (int i : data) {
			System.out.print(i + " ");
		}

		// would order ASC
		Arrays.sort(data);

		System.out.println("after sort");
		for (int i : data) {
			System.out.print(i + " ");
		}

		// remove last order, which is a largest number 1
		data = Arrays.copyOf(data, data.length - 1);

		System.out.println("after remove last element");
		for (int i : data) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nsecond largest number would be:");
		System.out.print(data[data.length - 1]);
	}

	private static void Solution_1(Integer[] in) {
		List<Integer> data = Arrays.asList(in);

		System.out.println("before sort");
		for (int i : data) {
			System.out.print(i + " ");
		}

		// order ASC
		Collections.sort(data);

		System.out.println("after sort");
		for (int i : data) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nsecond largest number would be:");
		System.out.print(data.get(data.size() - 2));
	}
}
