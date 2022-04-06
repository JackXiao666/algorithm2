package com.xy.licode;

import java.util.*;

/**
 * @author: JackXiao
 * Date:  2022/3/22  13:36
 */
public class Solution0046 {



	public List<List<Integer>> permute(int[] nums) {
		//获取输入的数组nums的长度
		int len = nums.length;
		//初始化空的动态数组存放全排列后的数组
		List<List<Integer>> answer = new ArrayList<>();
		//当传入的数组为空时直接返回空的数组answer
		if(len == 0){
			return answer;
		}

		//初始化栈存储
		Deque<Integer> path = new ArrayDeque<>();

		//初始化表示数字状态的数组used
		boolean[] used = new boolean[len];

		//初始化状态
		//创建递归函数，传入需要排列的数组，数组的长度，
		//当前已经选择的数字的个数（初始化为0），从根节点到任意结点的列表stack
		//储存数字状态的数组used，接收所有排列数组的数组answer
		dfs(nums,len,0,path,used,answer);




		return answer;
	}

	private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> answer) {
		//当遍历的深度等于数组的长度时，递归出口
		if (depth==len){
			answer.add(new ArrayList<>(path));
			return;
		}

		for (int i = 0; i < len; i++) {
			//如果该数字已经被使用过，跳过该数字
			if (used[i]){
				continue;
			}
			//该数字未被使用过，就将他放到栈的末尾，并且更改状态为true
			path.addLast(nums[i]);
			used[i] = true;

			//遍历完该层后遍历下一层
			dfs(nums,len,depth+1,path,used,answer);

			//回溯操作,上一步干了什么，就要执行相反的操作
			//重置i位置的数字的状态
			used[i] = false;
			//移出最后一个元素
			path.removeLast();

		}
	}


	public static void main(String[] args) {
		int[] nums ={1,2,3,4,5};
		Solution0046 s = new Solution0046();
		List<List<Integer>> permute = s.permute(nums);
		System.out.println(permute);


	}
}
