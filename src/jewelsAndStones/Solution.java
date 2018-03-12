package jewelsAndStones;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static int numJewelsInStones(String J, String S) {
		int result = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < J.length(); i++) {
			map.put(J.charAt(i), 1);
		}
		for (int i = 0; i < S.length(); i++) {
			if(map.containsKey(S.charAt(i)))
				result++;
		}
		
		return result;
	}
	
	public static int numJewelsInStoneLine(String J,String S) {
		return S.replaceAll("[^"+J+"]", "").length();
	}
	
	public static void main(String[] args) {
		String J = "aA";
		String S = "abAbAbc";
		System.out.println(numJewelsInStones(J, S));
		System.out.println(numJewelsInStoneLine(J, S));
	}

}
