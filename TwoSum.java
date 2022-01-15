
import java.util.*;

public class TwoSum {

	// given sets numbers and target
	public static void main(String[] args) {
		int[] nums = new int[] { 2, 17, 27, 7 };
		int target = 44;

		// return [index num 1, index num 2]
		// can't use same element index as return

		Solution.func(nums, target);
	}

	public static class Solution {
		public static void func(int[] nums, int target) {
			long startTime = System.nanoTime();
//			solution1(nums, target);
			solution2(nums, target);

			long endTime = System.nanoTime();
			System.out.println("\nTook " + (endTime - startTime) + " ns");
		}

		static void solution1(int[] nums, int target) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					int complement = target - nums[i];

					if (nums[j] == complement)
						System.out.println(String.format("%s,%s", i, j));
				}
			}
		}

		static void solution2(int[] nums, int target) {
			Map<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < nums.length; i++) {
				int complement = target - nums[i];

				if (map.containsKey(complement)) {
					System.out.print(String.format("%s,%s", map.get(complement), i));
				}

				map.put(nums[i], i);
			}
		}
	}

}