import java.util.Arrays;

public class SortManually {

	public static void main(String[] args) {
//		int[] a = new int[] { 1, 2, 3, 1, 2, 3 };
		// expected = 1,1,2,2,3,3

		int[] a = new int[] { 8, 5, 2, 4, 6, 3, 7 };
//		int[] a = new int[] { 9, 14, 3, 2, 43, 11, 58, 22 };

		int[] sorted = insertSort(a);

		System.out.print(Arrays.toString(sorted));

	}

	static int[] sort(int[] in) {

		for (int i = 0; i < in.length; i++) {
			for (int j = i + 1; j < in.length; j++) {
				int temp = 0;

				if (in[j] < in[i]) {
					temp = in[j];
					in[j] = in[i];
					in[i] = temp;
				}
			}
		}

		return in;
	}

	static int[] quickSort(int[] in, int lo, int hi) {

		if (lo < hi) {

		}

		return new int[] {};
	}

	static int[] insertSort(int[] in) {

		//big O(n^2)
		for (int i = 1; i < in.length; i++) {

			int key = in[i];
			int j = i;
			while (j > 0 && in[j - 1] > key) {
				in[j] = in[j - 1];
				j--;
			}
			in[j] = key;
		}

		return in;
	}
}
