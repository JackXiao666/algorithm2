package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/22  17:12
 */
public class Solution0055 {

	public boolean canJump(int[] nums) {
		//获取nums的最大下标
		int length = nums.length-1;
		//设置期望flag
		boolean flag = false;
		//定义计步器max,max的最大值为当前数组索引加当前数组索引对应的数字
		int max = 0;

		for (int index = 0; index < nums.length; index++) {
			if (index <= max){
				max = Math.max(max,index+nums[index]);
				if (max>=length){
					flag = true;
				}
			}
			else{
				flag = false;
			}
		}
		return flag;
	}

}
