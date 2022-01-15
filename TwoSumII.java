
public class TwoSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] { 3, 5, 7, 8, 9 };
		int target = 16;

		int[] answer = solution(nums, target);

		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
		}
	}

	public static int[] solution(int[] nums, int target) {

		// represent index / indices
		int small_pointer = 0;
		int large_pointer = nums.length - 1;

		while (small_pointer <= large_pointer) {
			int sum = nums[small_pointer] + nums[large_pointer];
			if (sum > target)
				large_pointer -= 1;
			else if (sum < target)
				small_pointer += 1;
			else {
				return new int[] { small_pointer, large_pointer };
			}
		}

		return new int[] { small_pointer, large_pointer };
	}

}
