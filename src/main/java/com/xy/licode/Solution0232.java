package com.xy.licode;

import java.util.Stack;

/**
 * @author: JackXiao
 * Date:  2022/3/30  14:36
 */
public class Solution0232 {

	class MyQueue {
		private Stack<Integer> inStack;
		private Stack<Integer> outStack;
		public MyQueue() {
			inStack = new Stack<>();
			outStack = new Stack<>();
		}

		public void push(int x) {
			if (!outStack.empty()){
				while (!outStack.empty()){
					inStack.push(outStack.pop());
				}
			}
			inStack.push(x);
		}

		public int pop() {
			if (outStack.isEmpty()){
				while(!inStack.empty()){
					outStack.push(inStack.pop());
				}
			}
			return outStack.pop();
		}

		public int peek() {
			if (outStack.isEmpty()){
				while(!inStack.empty()){
					outStack.push(inStack.pop());
				}
			}
			return outStack.peek();
		}

		public boolean empty() {
			return inStack.isEmpty() && outStack.empty();
		}
	}

}
