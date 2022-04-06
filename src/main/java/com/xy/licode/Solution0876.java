package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/30  10:05
 */
public class Solution0876 {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	class Solution {
		public ListNode middleNode(ListNode head) {
			ListNode fast = head,slow = head;
			while(fast!=null&&fast.next!=null){
				fast = fast.next.next;
				slow = slow.next;
			}
			return slow;
		}
	}
}
