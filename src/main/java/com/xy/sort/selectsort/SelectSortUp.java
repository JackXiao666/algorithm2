package com.xy.sort.selectsort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: JackXiao
 * Date:  2022/3/21  13:40
 */
public class SelectSortUp {



	public static int[] selectSort(int[] array){







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
