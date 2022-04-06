package com.datastructorandalgorithm.day03;

import java.util.Arrays;

/**
 * @author: JackXiao
 * Date:  2022/4/4  15:16
 */
public class ShellSort01 {
	public static void ShellSort(int[] array){
		//初始化步长
		int step = array.length / 2;

		while(step >= 1){

			for (int begin = 0; begin < step; begin++){
				insertSort(array, step, begin);
			}

			step = step / 2;
		}

	}
	public static void insertSort(int[] array, int step, int begin){
		int temp;
		for (int i = begin + step; i < array.length; i += step) {
			for (int j = i-step; j >= begin && array[j] > array[j+step]; j-=step) {
				temp = array[j];
				array[j] = array[j+step];
				array[j+step] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {5,4,3,2,1};
		ShellSort(array);
		System.out.println(Arrays.toString(array));
	}
}
