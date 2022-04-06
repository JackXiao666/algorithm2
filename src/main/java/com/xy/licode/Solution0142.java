package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/29  14:49
 */
public class Solution0142 {
	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 class Solution {
		public ListNode detectCycle(ListNode head) {
			if (head == null) {
				return null;
			}
			//定义快慢指针
			ListNode fastPtr = head, slowPtr = head;
			boolean isExist = false;
			while (fastPtr.next != null && fastPtr.next.next != null) {
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
				if (fastPtr == slowPtr) {
					isExist = true;
					break;
				}
			}
			if (isExist==true){
				slowPtr = head;
				while(slowPtr!=fastPtr){
					fastPtr = fastPtr.next;
					slowPtr = slowPtr.next;
				}
				return slowPtr;
			}
			return null;
		}
	}
}
