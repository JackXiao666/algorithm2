package com.datastructorandalgorithm.day02.bubblesort;

import java.util.Arrays;

/**
 * @author: JackXiao
 * Date:  2022/4/3  15:23
 */
public class BubbleSort01 {


	public int[] bubbleSort(int[] array){
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if (array[j]>array[j+1]) {
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = {5,4,3,2,1};
		BubbleSort01 bs = new BubbleSort01();
		System.out.println(Arrays.toString(bs.bubbleSort(array)));
	}
}
