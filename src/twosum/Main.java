package twosum;

import java.util.HashMap;

public class Main {

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				result[0] = map.get(target-nums[i]);
				result[1] = i;
				return result;
			}
			map.put(nums[i], i);
		}
		

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 4 };
		int target = 8;

		System.out.println(twoSum(nums, target)[0]);
		System.out.println(twoSum(nums, target)[1]);

	}

}
