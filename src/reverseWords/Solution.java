package reverseWords;

public class Solution {
	
	public static String reverseString(String s) {
		if(s == null)
			return null;
		
		char[] a = s.toCharArray();
		int i = 0,j = s.length()-1;
		while(i<j) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;j--;
		}
		
		return String.valueOf(a);
	}

	
	public static String reverseWords(String s) {
		String[] arrays = s.split(" ");
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < arrays.length; i++) {
			sBuilder.append(reverseString(arrays[i]));
			if(i != arrays.length-1)
				sBuilder.append(" ");
		}
		return sBuilder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}

}
