package com.xy.licode;

import java.util.*;

/**
 * @author: JackXiao
 * Date:  2022/3/22  11:50
 */
public class Solution0020 {

	public static boolean isMatch(String s){
		int length = s.length();

		//1.1、当字符串为奇数时括号不批配
		if (length % 2 == 1){
			return false;
		}

		// //1.2、当字符串为空时为，题意为匹配
		// if (s.isEmpty()){
		// 	return true;
		// }


		//2、输入的字符串为偶数时
		//2.1、创建一个hashmap用于比较是否匹配（[{
		HashMap<Character,Character> pairs = new HashMap<Character,Character>();
		pairs.put(')','(');
		pairs.put(']','[');
		pairs.put('}','{');



		//2.2、创建栈用于左括号的进入和弹出
		Stack<Character> stack = new Stack<>();

		//遍历字符串，以右括号为标准判断最近的左括号是否匹配
		//遇到左括号就入栈，遇到右括号时，有匹配的左括号就弹出左括号
		for (int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if (pairs.containsKey(ch)){
				//栈为空，则没有匹配的左括号或者栈顶不是匹配的左括号，返回false
				if (stack.isEmpty()|| ! stack.peek().equals(pairs.get(ch))){
					return false;
				}
				//如果存在与左括号匹配右括号，就弹出左括号
				stack.pop();

			}else {
				//否则就是左括号，入栈
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}





	public boolean isValid(String s) {
		int n = s.length();
		if (n % 2 == 1) {
			return false;
		}

		Map<Character, Character> pairs = new HashMap<Character, Character>() {{
			put(')', '(');
			put(']', '[');
			put('}', '{');
		}};
		Deque<Character> stack = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			char ch = s.charAt(i);
			if (pairs.containsKey(ch)) {
				if (stack.isEmpty() || ! stack.peek().equals(pairs.get(ch))) {
					return false;
				}
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}


	public static void main(String[] args) {

	}
}
