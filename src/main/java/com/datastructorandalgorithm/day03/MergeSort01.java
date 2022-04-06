package com.datastructorandalgorithm.day03;

/**
 * @author: JackXiao
 * Date:  2022/4/4  16:33
 */
public class MergeSort01 {

	public void mergeSort(int[] array){
		int[] temp = new int[array.length];
		MergeSort(array,0,array.length-1,temp);
	}

	public void MergeSort(int[] array, int start, int end, int[] temp) {


		if(start < end) {

			int middle = (start + end) / 2;

			MergeSort(array, start, middle, temp);

			MergeSort(array, middle, end, temp);

			for (int i = start; i <= middle; i++) {
				temp[i] = array[i];
			}

			for (int i = middle+1; i <= end; i++) {
				temp[i] = array[i];
			}

			int left = start;
			int right = middle + 1;
			int index = start;

			while(left <= middle && right <= end) {

				if (temp[left]<temp[right]){
					array[index++] = temp[left++];
				}else {
					array[index++] = temp[right++];
				}
			}

			if (left <= middle){
				while(left <= middle){
					array[index++] = temp[left++];
				}
			}

			if (right <= end){
				while(right <= end){
					array[index++] = temp[right++];
				}
			}

		} else{

			return;

		}
	}

	public static void main(String[] args) {

	}
}
