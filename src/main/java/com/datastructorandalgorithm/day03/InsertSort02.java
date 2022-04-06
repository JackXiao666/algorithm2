package com.datastructorandalgorithm.day03;

/**
 * @author: JackXiao
 * Date:  2022/4/4  14:10
 */
public class InsertSort02 {
	int insertIndex;

	public void InsertSort(int[] array){
		for (int i = 1; i < array.length; i++) {

			insertIndex = binarySearch(array,array[i],0,i-1);

			insertIndex = insertIndex < 0 ? insertIndex : -(insertIndex + 1);

			if (insertIndex != i){

				int temp = array[i];

				for (int j = i; j > insertIndex ; j--) {
						array[j] = array[j-1];
				}

				array[insertIndex] = temp;

			}

		}
	}

	private int binarySearch(int[] array, int key, int start,int end){
		if(start > end) {
			return -start - 1;
		}

		int middle = (start+end) / 2;

		if (key < array[middle]){
			return binarySearch(array, key, start, middle-1);
		}else if (key > array[middle]){
			return binarySearch(array, key, middle + 1, end);
		}else{
			return middle;
		}

	}

}
