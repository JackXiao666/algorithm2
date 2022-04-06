package com.datastructorandalgorithm.day05;

/**
 * @author: JackXiao
 * Date:  2022/4/5  9:01
 */
public class QuickSort01 {
	public void quickSort(int[] array, int start, int end) {

		if (start >= end) {
			return;
		}


		int i = start;
		int j = end;
		int temp;

		while(i < j) {

			while (i < j && array[i] <= array[j]) {
				i++;
			}

			if (i < j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

			while (i < j && array[j] >= array[i]) {
				j--;
			}

			if (i < j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}


		}

		int pivot = i;

		quickSort(array,start,pivot-1);
		quickSort(array,pivot+1,end);

	}

	public static void main(String[] args) {

	}
}
