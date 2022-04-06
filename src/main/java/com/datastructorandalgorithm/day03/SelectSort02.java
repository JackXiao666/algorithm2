package com.datastructorandalgorithm.day03;

import java.util.Arrays;

/**
 * @author: JackXiao
 * Date:  2022/4/3  16:06
 */
public class SelectSort02 {
	// public void selectSort(int[] array){
	// 	 /*
    //     1.创建两个变量，指向待搜索区间的起点和终点
    //     这两个变量同时标记的也是最小标准位和最大标准位的下标
    //      */
	// 	int begin = 0;
	// 	int end = array.length-1;
	//
    //     /*
    //     2.创建两个变量，用来记录搜索区间当中的最大元素下标和最小元素下标
    //     一轮搜索结束之后：
    //     最大元素下标和array[end]进行比较和交换
    //     最小元素下标和array[begin]进行比较和交换
    //      */
	// 	int minIndex;
	// 	int maxIndex;
	//
	// 	int tmp;
	// 	//3.创建外层循环，控制排序轮次
	// 	while(begin < end) {
	//
	// 		//4.首先定义minIndex和maxIndex的哨兵初值
	// 		minIndex = begin;
	// 		maxIndex = end;
	//
	// 		//5.开始从begin到end进行搜索：最大值和最小值的数组下标
	// 		for(int i = begin; i <= end; i++) {
	//
	// 			//找到比当前最小值更小的值
	// 			if(array[i] < array[minIndex]) {
	// 				minIndex = i;
	// 			}
	//
	// 			//找到比当前最大值更大的值
	// 			if(array[i] > array[maxIndex]) {
	// 				maxIndex = i;
	// 			}
	//
	// 		}
	//
	// 		//6.将找到的最小值和最小标准位上的元素取值进行交换
	// 		tmp = array[begin];
	// 		array[begin] = array[minIndex];
	// 		array[minIndex] = tmp;
	//
    //         /*
    //         7.对极端情况进行判断：
    //         如果整个待搜索序列中的最大值恰好存在于begin的位置上
    //         那么在上一步的交换过程当中，这个最大值就会被交换到minIndex的位置上
    //         所以应该对这种情况做出判断和处理
    //          */
	// 		if(maxIndex == begin) {
	// 			//上面的交换完成后，原先处于begin位置上的实际最大值，现在跑到了minIndex位置上
	// 			maxIndex = minIndex;
	// 		}
	//
	// 		//8.将找到的最大值和最大标准位上的元素取值进行交换
	// 		tmp = array[end];
	// 		array[end] = array[maxIndex];
	// 		array[maxIndex] = tmp;
	//
	// 		//9.缩短待搜索序列范围
	// 		begin++;
	// 		end--;
	//
	// 	}
	// }
	public void selectSort(int[] array){
		int begin = 0;
		int end = array.length-1;
		int maxIndex;
		int minIndex;
		int temp;
		while(begin < end){
			minIndex = begin;
			maxIndex = end;
			for(int i = begin; i <= end; i++){

				if (array[minIndex]>array[i]){
					minIndex = i;
				}

				if (array[maxIndex]<array[i]){
					maxIndex = i;
				}
			}

			temp = array[begin];
			array[begin] = array[minIndex];
			array[minIndex] = temp;

			if (maxIndex==begin){
				maxIndex = minIndex;
			}

			temp = array[end];
			array[end] = array[maxIndex];
			array[maxIndex] = temp;


			begin++;
			end--;
		}
	}


	public static void main(String[] args) {
		int[] array = {5,4,3,2,1};
		SelectSort02 ss = new SelectSort02();
		ss.selectSort(array);
		System.out.println(Arrays.toString(array));
	}
}
