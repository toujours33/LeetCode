package numberComplement;

public class Solution {
	
	public static int findComplement(int num) {
		int highest = Integer.highestOneBit(num);
		return ((highest<<1)-1)^num;
	}

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
}
