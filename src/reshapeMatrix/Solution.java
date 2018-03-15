package reshapeMatrix;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ������� ԭ����Ԫ������˳�򹹳ɸ�����Ŀ���������С��һ������ԭ����
 * 
 * @author Jerry
 *
 */

public class Solution {

	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int row = nums.length;
		int col = nums[0].length;
		if(row*col != r*c)
			return nums;
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 0; i < row; i++) {
			for(int j = 0;j<col;j++) {
				deque.add(nums[i][j]);
			}
		}
		int [][] target = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				target[i][j] = deque.pollFirst();
			}
		}
		return target;
	}
	
	public static void main(String[] args) {
		int[][] source = {{1,2,3},{4,5,6}};
		System.out.println(matrixReshape(source, 3, 2));
	}

}
