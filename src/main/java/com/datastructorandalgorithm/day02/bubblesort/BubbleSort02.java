package com.datastructorandalgorithm.day02.bubblesort;

import java.util.Arrays;

/**
 * @author: JackXiao
 * Date:  2022/4/3  15:23
 */
public class BubbleSort02 {


	public void bubbleSort(int[] array){
		boolean flag;
		for (int i = 0; i < array.length-1; i++) {
			flag = false;
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j]>array[j+1]) {
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
					flag = true;
				}
			}
			if (!flag){
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {5,4,3,2,1};
		BubbleSort02 bs = new BubbleSort02();
		bs.bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
