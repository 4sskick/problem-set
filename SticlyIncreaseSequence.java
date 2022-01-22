import java.util.Arrays;

/*
 * given array of integer {2 6 4 5 7}
 * output must be an a new array with number are ordered sequenced e.g {2 3 4 5 7} if we found 6 are not ordered right then we complement with x=3
 * let's assumed sorted in ASC
 * 
 * example:
 * - lets select arr[1] = 6 and x = 3
 * - then perform arr[1] = arr[1] - x = 6 - 3 = 3 for arr[1]
 * - replace index to new value
 * - then check is the array of integer inside already ordered correctly
 * 
 * so brute the number of x to get ordered right number of array inside
 */

public class SticlyIncreaseSequence {

	public static void main(String[] args) {

		int[] input = new int[] { 2, 9, 4, 8, 7 };

//		int output[] = solve(input.length, input);
		String output_ = solve_(input.length, input);

//		System.out.print(Arrays.toString(output));
		System.out.print(output_);

	}

	private static int[] solve(int length, int[] input) {

		if (length > 1) {

			int i = length - 1;
			int comp = input[i - 1] - input[i];

			while (input[i] <= input[i - 1]) {

				if (input[i - 1] > 0) {
					input[i - 1] = input[i - 1] - comp;
					comp++;
				} else
					break;
			}

			solve(length - 1, input);
		}

		return input;
	}

	private static String solve_(int length, int[] input) {

		if (length > 1) {
			int i = length - 1;
			int comp = input[i - 1] - input[i];

			while (input[i] <= input[i - 1]) {

				if (input[i - 1] > 0) {
					input[i - 1] = input[i - 1] - comp;

					comp++;
				} else
					break;
			}

			if (input[i - 1] < 0) {
				System.out.print(Arrays.toString(input) + " if");

				return "no";
			}

		} else {
			System.out.print(Arrays.toString(input) + " else");
		
			return "yes";
		}

		return solve_(length - 1, input);
	}

}
