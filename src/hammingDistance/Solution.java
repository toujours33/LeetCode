package hammingDistance;

public class Solution {

	public static int hammingDistance(int x, int y) {

		int xor = x ^ y;
		int res = 0;
		while (xor != 0) {
			res += xor & 1;
			xor >>>= 1;
		}

		return res;

	}

	public static void main(String[] args) {
		int x = 1, y = 2;
		System.out.println(hammingDistance(x, y));
	}

}
