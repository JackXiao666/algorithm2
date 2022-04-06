package com.xy.licode;

import java.util.HashMap;

/**
 * @author: JackXiao
 * Date:  2022/3/23  17:23
 */
public class Solution00010 {
	HashMap<Integer, Integer> hashMap = new HashMap<>();
	public int fib(int n) {
		if(n == 0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if (hashMap.get(n) != null){
			return hashMap.get(n);
		}else{
			int result =fib(n-1)+fib(n-2);
			hashMap.put(n,result);
			return result;
		}
	}
}
