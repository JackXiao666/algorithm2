package com.xy.licode;

import java.util.HashMap;

/**
 * @author: JackXiao
 * Date:  2022/3/23  17:43
 */
public class Solution0001 {
	HashMap<Integer, Integer> hashMap = new HashMap<>();
	public int[] twoSum(int[] nums, int target) {
		int[] array = new int[2];
		// for (int i = 0; i < nums.length-1; i++) {
		// 	for (int j = i+1; j < nums.length; j++) {
		// 		if (target==nums[i]+nums[j]){
		// 			array[0] = i;
		// 			array[1] = j;
		// 		}
		// 	}
		// }
		// return array;

		for (int i = 0; i < nums.length; i++) {
			int t = target-nums[i];
			Integer index = hashMap.get(t);
			if (index!=null){
				array[1] = index;
				array[0] = i;
			}else{
				hashMap.put(nums[i], i);
			}
		}

		return array;
	}
}
