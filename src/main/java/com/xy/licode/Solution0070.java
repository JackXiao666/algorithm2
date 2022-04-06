package com.xy.licode;

import java.util.HashMap;

/**
 * @author: JackXiao
 * Date:  2022/3/23  16:39
 */
public class Solution0070 {
	private HashMap<Integer,Integer> hashMap = new HashMap<>();


	public int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		// if (hashMap.get(n)!=null){
		// 	return hashMap.get(n);
		// }else{
		// 	int result = climbStairs(n-1)+climbStairs(n-2);
		// 	hashMap.put(n,result);
		// 	return  result;
		// }

		int result = 0;
		int x = 1;
		int y = 2;

		for (int i = 0; i <= n; i++) {
			result = x+y;
			x = y;
			y = result;
		}


		return result;

	}
}
