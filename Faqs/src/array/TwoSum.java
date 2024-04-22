package array;

public class TwoSum {

	public static void main(String[] args) {

		TwoSum solu = new TwoSum();
		int[] nums = { 2, 4, 7, 3, 5 };
		int target = 11;
		solu.twoSum(nums, target);
	}

	public int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[]{i, j};
				}
			}
		}
		return new int[] {};
	}
}