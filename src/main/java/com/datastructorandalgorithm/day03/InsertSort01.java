package com.datastructorandalgorithm.day03;

/**
 * @author: JackXiao
 * Date:  2022/4/4  14:10
 */
public class InsertSort01 {
	public void InsertSort(int[] array){
		for (int i = 1; i < array.length; i++) {
			for (int j = i-1; j >= 0 && array[j] > array[j+1]; j--) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
			}
		}
	}
}
