package com.xy.licode;

import java.util.Arrays;

/**
 * @author: JackXiao
 * Date:  2022/3/23  18:54
 */
public class Solution0088 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int k = m+n;
		int[] temp = new int[k];
		int p1;
		int p2;
		int index;
		for (p1 = 0,p2 = 0,index = 0;index<k;index++){
			if (p1>=m){
				temp[index]=nums2[p2++];
			}
			else if (p2>=n){
				temp[index]=nums1[p1++];
			}
			else if (nums1[p1]<nums2[p2]){
				temp[index] = nums1[p1++];
			}
			else{
				temp[index] = nums2[p2++];

			}
		}
		for (int i = 0; i < k; i++) {
			nums1[i] = temp[i];
		}
	}

	public static void main(String[] args) {
		Solution0088 s = new Solution0088();
		int[] nums1 ={1,4,8,0,0,0};
		int[] nums2 ={4,6,13};
		s.merge(nums1,3,nums2,3);
		System.out.println(Arrays.toString(nums1));
	}


}
