package distributedCandies;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	public static int distributedCandies(int[] candies) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < candies.length; i++) {
			map.put(i, i);
		}
		return map.size()>candies.length/2 ? candies.length/2 : map.size();
	}
	
	public static int distributedCandies2(int[] candies) {
		Set<Integer> set = new HashSet<>();
		for (Integer integer : candies) {
			set.add(integer);
		}
		return set.size()>candies.length/2?candies.length/2:set.size();
	}

}
