package arrayPartitionOne;

import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		int[] num = {1,2,3};
		arrayPairSum(num);
	}
	
	public static int arrayPairSum(int [] nums) {
		int j= 5;
		System.out.println(Integer.highestOneBit(j));
		int result = 0;
		Arrays.sort(nums);
		for(int i = nums.length-2;i>=0;i = i-2) {
			result += nums[i];
		}
		return result;
	}

}
