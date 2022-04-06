package com.datastructorandalgorithm.day01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: JackXiao
 * Date:  2022/4/3  10:52
 */
public class TwoQueueToStack<T> {
	Queue<T> queue1 = new LinkedList();
	Queue<T> queue2 = new LinkedList();

	public void offer(T t){
		queue1.offer(t);
	}

	public T pool(){
		T result;
		if(queue1.isEmpty()){
			return null;
		}
		while(queue1.size()>1){
			queue2.offer(queue1.poll());
		}
		result = queue1.poll();
		while(!queue2.isEmpty()){
			queue1.offer(queue2.poll());
		}
		return result;
	}

	public T peek(){
		return null;
	}



	public static void main(String[] args) {

	}
}
