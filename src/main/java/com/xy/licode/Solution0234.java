package com.xy.licode;

/**
 * @author: JackXiao
 * Date:  2022/3/30  9:25
 */
public class Solution0234 {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	class Solution {
		public boolean isPalindrome(ListNode head) {
			//定义快慢指针
			ListNode fastPtr = head,slowPtr = head;
			while(fastPtr!=null&&fastPtr.next!=null){
				fastPtr = fastPtr.next.next;
				slowPtr = slowPtr.next;
			}
			//链表结点是奇数个就把慢指针向后移动一次在反转，偶数个就直接反转
			if (fastPtr!=null){
				slowPtr = slowPtr.next;
			}

			slowPtr = reverseList(slowPtr);
			//链表反转后，将快指针指向头结点
			fastPtr = head;

			while(slowPtr!=null){
				if (fastPtr.val!=slowPtr.val){
					return false;
				}
				fastPtr = fastPtr.next;
				slowPtr = slowPtr.next;
			}
			return true;
		}

		/*翻转链表*/
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
