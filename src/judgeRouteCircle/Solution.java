package judgeRouteCircle;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static boolean judgeCircle(String moves) {
		Map<String, Integer> map = new HashMap<>();
		map.put("horizontal", 0);
		map.put("vertical", 0);
		for (Character character : moves.toCharArray()) {
			switch (character) {
			case 'L':
				map.put("horizontal", map.get("horizontal")-1);
				break;
			case 'R':
				map.put("horizontal", map.get("horizontal")+1);
				break;
			case 'U':
				map.put("vertical", map.get("vertical")+1);
				break;
			case 'D':
				map.put("vertical", map.get("vertical")-1);
				break;
			default:
				break;
			}
		}
		if(map.get("horizontal")==0&&map.get("vertical")==0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		String moves ="UDLRR";
		System.out.println(judgeCircle(moves));
		
	}
	
}
