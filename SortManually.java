
public class SortManually {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 1, 2, 3 };
		// expected = 1,1,2,2,3,3

		int[] sorted = sort(a);
		for (int i = 0; i < a.length; i++) {
			

			System.out.print(sorted[i]);
		}
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
		
		if(lo< hi) {
			
		}
		
		return new int[] {};
	}
}
