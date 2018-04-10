package nextGreater;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import cst.wyz.utils.ArrayOperation;
import cst.wyz.utils.CastBaseTypeArray;

public class Solution {

	public int[] nextGreaterElementOn2(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums2.length; i++) {
			for (int j = i + 1; j < nums2.length; j++) {
				if (nums2[j] > nums2[i]) {
					map.put(nums2[i], nums2[j]);
					break;
				}
			}
		}
		
		for (int i = 0; i < nums1.length; i++) {
			result[i] = map.getOrDefault(nums1[i], -1);
		}
		return result;

	}

	public int[] nextGreaterOn(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];
		Map<Integer, Integer> map = new HashMap<>(); 
		Stack<Integer> stack = new Stack<>();
		for (int num : nums2) {
			while (!stack.isEmpty() && stack.peek() < num)
				map.put(stack.pop(), num);
			stack.push(num);
		}
		for (int i = 0; i < nums1.length; i++)
			result[i] = map.getOrDefault(nums1[i], -1);
		return result;
	}

	public static void main(String[] args) {
		int nums1[] = new int[] { 4, 1, 2 };
		int nums2[] = new int[] { 1, 3, 2, 4 };
		new ArrayOperation<Integer>().printArray(CastBaseTypeArray.intCastInteger(new Solution().nextGreaterElementOn2(nums1, nums2)), "测试结果（O2）：");
		new ArrayOperation<Integer>().printArray(CastBaseTypeArray.intCastInteger(new Solution().nextGreaterOn(nums1, nums2)), "测试结果（O）");

	}

}
