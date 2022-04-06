package com.xy.licode;

import org.omg.CORBA.LongLongSeqHelper;

/**
 * @author: JackXiao
 * Date:  2022/3/29  12:17
 */
public class Solution0021 {

	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			/*if (list1==null) {
				return list2;
			}
			if (list2==null){
				return list1;
			}
			//创建结果链表
			ListNode resultNode = new ListNode();
			//创建p指向resultNode;
			ListNode p = resultNode;
			while(list1 !=null && list2!=null){
				if (list1.val<=list2.val){
					p.next = list1;
					list1 = list1.next;
				}else{
					p.next = list2;
					list2 = list2.next;
				}
				p = p.next;
			}
			//其中一个链表遍历完了，就把另一个链表挂载到p后面
			if (list1!=null){
				p.next = list1;
			}
			if (list2!=null){
				p.next = list2;
			}

			return resultNode.next;*/

			if (list1==null) {
				return list2;
			}
			if (list2==null){
				return list1;
			}
			if (list1.val<= list2.val){
				list1.next = mergeTwoLists(list1.next,list2);
				return list1;
			}
			list2.next = mergeTwoLists(list1,list2.next);
			return list2;
		}
	}
}
