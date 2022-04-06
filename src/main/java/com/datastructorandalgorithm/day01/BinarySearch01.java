package com.datastructorandalgorithm.day01;

/**
 * @author: JackXiao
 * Date:  2022/4/3  10:05
 */
public class BinarySearch01 {

	public static int binarySearch(int[] array,int key){
		int length = array.length;
		int start = 0;
		int end = length - 1;
		int middle;

		while(start<=end){
			middle = (start+end)/2;
			if (array[middle]<key){
				start = middle + 1;
			}else if (array[middle]>key){
				end = middle - 1;
			}else{
				return middle;
			}
		}

		return -start-1;
	}




	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i <a.length; i++) {
			a[i] = i + 1;
		}
	}
}
