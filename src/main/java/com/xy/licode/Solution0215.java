package com.xy.licode;

import java.util.Arrays;

/**
 * @author: JackXiao
 * Date:  2022/3/22  20:23
 */
public class Solution0215 {
	public int findKthLargest(int[] nums, int k) {

		int length = nums.length;

		Arrays.sort(nums);

		return nums[length-k];
	}
}
