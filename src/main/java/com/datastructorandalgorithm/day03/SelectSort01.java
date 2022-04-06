package com.datastructorandalgorithm.day03;

import java.util.Arrays;

/**
 * @author: JackXiao
 * Date:  2022/4/3  16:06
 */
public class SelectSort01 {
	public void selectSort(int[] array){
		int min;
		int t;
		for (int i = 0; i < array.length-1; i++) {
			min = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]){
					min = j;
				}
			}
			if (min!=i){
				t = array[min];
				array[min] = array[i];
				array[i] = t;
			}
		}
	}



	public static void main(String[] args) {
		int[] array = {5,4,3,2,1};
		SelectSort01 ss = new SelectSort01();
		ss.selectSort(array);
		System.out.println(Arrays.toString(array));
	}
}
