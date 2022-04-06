package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/29  7:51
 */
public class Solution0283 {
	public void solve(int[] nums){
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]!=0){
				nums[j++] = nums[i];
			}
		}

		for (int i = j; i < nums.length; i++) {
			nums[i] = 0;
		}



	}
}
