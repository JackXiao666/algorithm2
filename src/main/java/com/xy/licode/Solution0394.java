package com.xy.licode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: JackXiao
 * Date:  2022/3/30  15:17
 */
public class Solution0394 {
	class Solution {
		public String decodeString(String s) {
			Deque<Integer> numStack = new LinkedList<>();//数字栈
			Deque<StringBuilder> sbStack = new LinkedList<>();//字符栈
			int multi = 0;//倍数 用于计算数字
			StringBuilder sb = new StringBuilder();
			for(char ch : s.toCharArray()){
				if(Character.isDigit(ch)){
					multi = multi * 10 + ch - '0';//数字在'['之前
				}//遇到'['之前会处理完数字
				else if(ch == '['){
					numStack.push(multi);//把处理完的数字先放起来
					sbStack.push(sb);//把字符存起来 用于拼接
					multi = 0;//归位
					sb = new StringBuilder();//归位 用于下一次拼接
				}
				else if(ch == ']'){ //就近处理 匹配最近的数字和字符 处理完就吃掉一个数字和'['
					StringBuilder sbTemp = sbStack.pop();
					int numTemp = numStack.pop();
					for(int i = 0;i<numTemp;i++){
						sbTemp.append(sb.toString());
					}
					sb = sbTemp;
				}
				else{
					sb.append(ch);
				}
			}
			return sb.toString();
		}
	}

}
