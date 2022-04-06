package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/30  8:58
 */
public class Solution0206 {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	class Solution {
		public ListNode reverseList(ListNode head) {
			ListNode preNode = null;
			ListNode curr = head;
			while (curr != null) {
				ListNode next = curr.next;
				curr.next = preNode;
				preNode = curr;
				curr = next;
			}
			return preNode;
		}
	}
}
