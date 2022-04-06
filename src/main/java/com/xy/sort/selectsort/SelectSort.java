package com.xy.sort.selectsort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: JackXiao
 * Date:  2022/3/21  13:40
 */
public class SelectSort {



	public static int[] selectSort(int[] array){

		for (int i = 0; i < array.length-1; i++) {
			int min = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j]<array[min]){
					min = j;
				}
			}
			if (min!=i){
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
		return array;
	}




	public static void main(String[] args) {
		int[] array = new int[10];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			int num = random.nextInt(100);
			array[i] = num;
		}

		System.out.println("排序前的数组："+ Arrays.toString(array));


		array = selectSort(array);
		System.out.println("排序后的数组："+ Arrays.toString(array));



	}





}
