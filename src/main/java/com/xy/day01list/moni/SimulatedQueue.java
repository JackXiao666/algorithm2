package com.xy.day01list.moni;

import java.util.Stack;

/**
 * 两个栈模拟一个队列
 */
public class SimulatedQueue {

    private Stack<String> s1 = new Stack<>();  //主栈
    private Stack<String> s2 = new Stack<>();  //辅助栈

    // 用于表示当前模拟队列中，元素数量的变量
    private int size = 0;

    /**
     * 元素加入模拟队列的方法
     * @param str 加入模拟队列的元素
     */
    public void offer(String str) {
        s1.push(str);
        size++;
    }

    /**
     * 将模拟队列头元素进行出队列的操作
     * @return 模拟队列的头结点
     */
    public String poll() {

        if(size == 0) {
            return null;
        }

        //1.将主栈结构s1当中，除了栈底元素之外，其余所有元素出栈s1，直接入栈s2辅助栈当中
        while(s1.size() > 1) {
            s2.push(s1.pop());
        }
        //循环结束的时候，s1当中仅剩余一个栈底元素，就是第一个加入模拟队列中的元素

        //2.将主栈s1当中的栈底元素直接进行出栈返回，表示元素出模拟队列
        String result = s1.pop();

        //3.将辅助栈结构s2当中所有的元素再次逆序到会s1当中，实现负负得正的效果
        //保证后续加入模拟队列的元素，与先前的元素顺序不变
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        //这个循环结束的时候，s1当中剩余的元素就通过负负得正的思路保持原有的入队列顺序

        size--;
        return result;

    }

    /**
     * 看模拟队列的队列头元素，但是不讲队列头元素出队列
     * @return 模拟队列的队列头元素
     */
    public String peek() {

        if(size == 0) {
            return null;
        }

        while(s1.size() > 1) {
            s2.push(s1.pop());
        }

        String result = s1.peek();  //此时看到的主栈结构的栈顶元素也就是模拟队列的队列头元素

        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        return result;

    }

}
