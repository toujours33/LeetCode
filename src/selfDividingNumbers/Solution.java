package selfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	Strategy strategy;
	
	public Solution(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy = strategy;
	}
	
	public List<Integer> selfDividingNumbers(int left,int right){
		List<Integer> result = new ArrayList<Integer>();

		for(int i = left;i<=right;i++) {
			if(!String.valueOf(i).contains("0")) {
				if(strategy.selfDividing(i))
					result.add(i);
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		Solution solution = new Solution(new ModStrategy());
		System.out.println(solution.selfDividingNumbers(1, 22));
		
		Solution solution2 = new Solution(new CharStrategy());
		System.out.println(solution2.selfDividingNumbers(1, 22));
	}

}
