package reverseString;

/**
 * ·´×ª×Ö·û´®
 * @author Jerry
 *
 */
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
	
}
