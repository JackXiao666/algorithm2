package com.datastructorandalgorithm.day01;

import java.util.Stack;

/**
 * @author: JackXiao
 * Date:  2022/4/3  10:20
 */
public class TwoStackToQueue<T> {
	/**
	 * 入栈（主）
	 */
	Stack<T> s1 = new Stack();
	/**
	 * 出栈（辅）
	 */
	Stack<T> s2 = new Stack();

	/**
	 * 模拟入队
	 */
	private void push(T t){
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		s1.push(t);
	}

	/**
	 * 模拟出队
	 */
	public T pop(){
		if (s1.isEmpty()){
			return null;
		}
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.pop();
	}

	/**
	 * 查看队首元素
	 */
	public T peek(){
		if(s1.isEmpty()){
			return null;
		}
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.peek();
	}

	/**
	 * 判断队列是否为空
	 */
	public boolean isEmpty(){
		return s1.isEmpty() && s2.empty();
	}
}
