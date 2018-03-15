package baseballGame;

import java.util.LinkedList;

/**
 * 计算得分，具有一定的规则
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * @author Jerry
 *
 */

public class Solution {
	
	public static int calPoints(String[] ops) {
		LinkedList<Integer> score = new LinkedList<>();
		int sum = 0;
		for (String round : ops) {
			switch (round) {
			case "+":
				score.addFirst(score.get(0) + score.get(1));
				break;
			case "D":
				score.addFirst(score.getFirst()*2);
				break;
			case "C":
				score.pop();
				break;
			default:
				score.addFirst(Integer.parseInt(round));
				break;
			}
		}
		for (Integer integer : score) {
			sum +=integer;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] test = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(test));
	}

}
