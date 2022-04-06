package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/29  14:01
 */
public class Solution0141 {
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 class Solution {
		public boolean hasCycle(ListNode head) {
			if (head == null) {
				return false;
			}
			//定义快慢指针
			ListNode fastPtr = head, slowPtr = head;
			while (fastPtr.next != null && fastPtr.next.next != null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
				if (fastPtr == slowPtr) {
					return true;
				}
			}
			return false;
		}
	}
}
