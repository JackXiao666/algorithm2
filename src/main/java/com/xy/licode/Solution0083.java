package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/29  13:12
 */
public class Solution0083 {

	  class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	class Solution {
		public ListNode deleteDuplicates(ListNode head) {
			/*if (head==null){
				return null;
			}
			ListNode currentNode = head;
			while (currentNode.next!=null){
				if (currentNode.val==currentNode.next.val){
					currentNode.next = currentNode.next.next;
				}else{
					currentNode = currentNode.next;
				}
			}
			return head;
		}*/


			if (head == null || head.next == null) {
				return head;
			}
			head.next = deleteDuplicates(head.next);
			return head.val == head.next.val ? head.next : head;
		}
	}
}
