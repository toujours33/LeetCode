package longestSubstringWithoutRepeat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static int lengthOfLongestSubstring(String s) {
		char[] charArray = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0;
		int i = 0, j = 0;
		while (i < charArray.length && j < charArray.length) {
			if (!map.containsKey(charArray[j])) {
				map.put(charArray[j], j);
				max = map.size() > max ? map.size() : max;
				j++;
			} else {
				map.remove(charArray[i++]);
			}
		}
		return max;
	}

	public static int slidingWindow(String s) {
		Set<Character> set = new HashSet<>();
		int max = 0, i = 0, j = 0;
		while (i < s.length() && j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = Math.max(max, set.size());
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String string = "mitpxltadcsyzdszbpwnfojodbqnhduvnplmagpdljcknwmqokdtaohfpzsyemwsbjecpthcdjpsibkwnqpneyswxl";
		System.out.println(slidingWindow(string));
		System.out.println(lengthOfLongestSubstring(string));
	}

}
