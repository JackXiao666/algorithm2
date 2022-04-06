package com.xy.day01list.moni;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 使用连个队列模拟一个栈结构
 */
public class SimulatedStack {

    private Queue<String> q1 = new LinkedList<>();  //主队列
    private Queue<String> q2 = new LinkedList<>();  //辅助队列

    //实时记录当前模拟栈结构当中元素数量的变量
    private int size = 0;

    /**
     * 元素加入模拟栈结构的方法
     * @param str 入模拟栈的元素
     */
    public void push(String str) {
        q1.offer(str);
        size++;
    }

    /**
     * 元素出模拟栈结构的方法
     * @return 模拟栈结构中的栈顶元素，也就是主队列中的队列尾元素
     */
    public String pop() {

        if(size == 0) {
            return null;
        }

        //1.将主队列q1当中除了队尾的元素之外，其余元素全部出队列，加入q2当中
        while(q1.size() > 1) {
            q2.offer(q1.poll());
        }

        //2.将主队列q1的最后一个元素出队列，表示模拟栈栈顶元素出栈
        String result = q1.poll();

        //3.将辅助队列q2当中所有的元素倒回主队列q1当中，保证后续入模拟栈结构的元素顺序正确
        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

        size--;
        return result;

    }

    /**
     * 看模拟栈的栈顶元素，只看不出
     * @return 模拟栈的栈顶元素
     */
    public String peek() {

        if(size == 0) {
            return null;
        }

        while(q1.size() > 1) {
            q2.offer(q1.poll());
        }

        /*
        将主队列当中剩余的最后一个元素拿出来
        1.作为返回值进行保存
        2.将result还得加入q2辅助队列当中，保证所有元素相对顺序不改变
         */
        String result = q1.poll();
        q2.offer(result);

        while(!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

        return result;

    }

}
