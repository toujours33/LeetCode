package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * 输出一个序列，包括1 到 输入整数之间的所有整数 遇到被 3 整除不被 5 整除的数输出Fizz 遇到被 5 整除不被 3 整除的数输出Buzz
 * 遇到同时被 3、5 整除的数 输出 FizzBuzz
 * 
 * 通用揭发：采用取余德操作，考虑到取余操作要复杂于其他操作，所以也可以采用叠加 3、5的方式
 * 
 * @author Jerry
 *
 */
public class Solution {

	public static List<String> fizzBuzz(int n) {
		int fizz = 3, buzz = 5;
		List<String> result = new ArrayList<>();
		for(int i = 0;i<=n;i++) {
			if(i != fizz && i != buzz) {
				result.add(String.valueOf(i));
				continue;
			}
			if(i == fizz && i == buzz) {
				result.add("FizzBuzz");
				fizz+=3;
				buzz+=5;
			}
			else if(i == fizz) {
				result.add("Fizz");
				fizz += 3;
			}
			else if(i == buzz) {
				result.add("Buzz");
				buzz += 5;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}

}
