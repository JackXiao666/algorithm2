package com.xy.licode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: JackXiao
 * Date:  2022/3/22  19:40
 */
public class Solution0078 {

	/**
	 * 结果集
	 */
	List<List<Integer>> res = new ArrayList<>();

	/**
	 * 临时辅助集合
	 */
	List<Integer> list = new ArrayList<>();

	public List<List<Integer>> subsets(int[] nums) {

		res.add(new ArrayList<Integer>(list));

		dfs(nums,0);

		return res;
	}
	public void dfs(int[] nums, int start){
		if (start>=nums.length) {
			return;
		}

		for (int i = start; i < nums.length; i++) {
			list.add(nums[i]);
			res.add(new ArrayList<>(list));
			dfs(nums,i+1);
			list.remove(list.size()-1);
		}
	}
}
