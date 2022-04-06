package com.xy.licode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: JackXiao
 * Date:  2022/3/29  15:04
 */
public class Solution0160 {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			if (headA==null||headB==null){
				return null;
			}

			ListNode PA = headA,PB = headB;

			while (PA!=PB){
				PA = PA ==null ? headA : PA.next;
				PB = PB ==null ? headA : PB.next;
			}
			return PA;
		}
	}
}
