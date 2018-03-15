package keyboardRow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
	public static String[] findWords(String[] words) {
		String [] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		List<String> result = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<keyboard.length;i++) {
			for(char c : keyboard[i].toCharArray()) {
				map.put(c, i);
			}
		}
		for(String word : words) {
			if(word.length()==0)
				continue;
			int index = map.get(word.toLowerCase().charAt(0));
			for(char c:word.toLowerCase().toCharArray()) {
				if(map.get(c) != index) {
					index = -1;
					break;
				}
			}
			if(index != -1)
				result.add(word);
				
		}
		return result.toArray(new String[0]);
		
		
	}
	
	public static void main(String[] args) {
		String[] test = {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(findWords(test));
	}

}
