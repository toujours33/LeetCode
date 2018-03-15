package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * ���һ�����У�����1 �� ��������֮����������� ������ 3 �������� 5 �����������Fizz ������ 5 �������� 3 �����������Buzz
 * ����ͬʱ�� 3��5 �������� ��� FizzBuzz
 * 
 * ͨ�ýҷ�������ȡ��²��������ǵ�ȡ�����Ҫ��������������������Ҳ���Բ��õ��� 3��5�ķ�ʽ
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
