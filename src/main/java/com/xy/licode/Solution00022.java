package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/30  11:12
 */
public class Solution00022 {

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	class Solution {
		public ListNode getKthFromEnd(ListNode head, int k) {
			if (head==null||k<=0){
				return null;
			}
			ListNode fast = head,slow = head;
			for (int i = 1; i < k; i++) {
				if (fast.next!=null){
					fast = fast.next;
				}
			}
			while(fast.next!=null){
				slow = slow.next;
				fast = fast.next;
			}
			return slow;
		}
	}
}
