package com.datastructorandalgorithm.day01;

/**
 * @author: JackXiao
 * Date:  2022/4/3  12:42
 */
public class BinarySearch02 {

	public int BinarySearch(int[] array, int key){
		int start = 0;
		int end = array.length - 1;
		int result = BinarySearch(array,key,start,end);
		return result;
	}


	public int BinarySearch(int[] array,int key,int start,int end){
		if (start>end){
			return -start-1;
		}
		int middle = (start + end) / 2;
		if (key < array[middle]){
			return BinarySearch(array, key, start, middle-1);
		}else if (key > array[middle]){
			return BinarySearch(array, key, middle+1,end);
		}else{
			return key;
		}
	}



	public static void main(String[] args) {

	}
}
