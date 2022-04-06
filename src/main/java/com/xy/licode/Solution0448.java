package com.xy.licode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: JackXiao
 * Date:  2022/3/29  8:01
 */
public class Solution0448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		int n = nums.length;
		for (int num : nums) {
			//将每个数的值减一后作为下标，为了防止重复加n，每次都对n取余还原数据
			int x = (num-1)%n;
			nums[x] += n;
		}
		for (int i = 0; i < n; i++) {
			if (nums[i]<=n){
				result.add(i+1);
			}
		}

		return result;
	}
}
