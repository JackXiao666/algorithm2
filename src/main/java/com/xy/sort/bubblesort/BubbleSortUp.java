package com.xy.sort.bubblesort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: JackXiao
 * Date:  2022/3/20  15:40
 */
public class BubbleSortUp {

	public static int[] getArray(int[] array){
		int n = array.length;
		boolean flag = false;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j]>array[j+1]){
					flag = true;
				}else{
					flag = false;
				}

				if (flag == true){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}



	public static void main(String[] args) {
		//1、生成随机数组
		Random random = new Random();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			int num = random.nextInt(10000);
			array[i] = num;
		}
		System.out.println("排序前的数组："+Arrays.toString(array));



		//排序数组
		array = getArray(array);

		System.out.println("排序后的数组："+Arrays.toString(array));
	}
}
