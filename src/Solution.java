//Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
 
public class Solution {
	public void reorderList(ListNode head) {
	    if(head == null || head.next == null)
	    	return;
	    
	    ListNode slow = head;
	    ListNode fast = head;
	    
	    while(fast.next != null && fast.next.next != null){
	    	slow = slow.next;
	    	fast = fast.next.next;
	    }
	    
	    ListNode mid = slow.next;
	    slow.next = null;
	    ListNode pre = null;
	    ListNode last = mid;
	    
	    while(last != null){
	    	ListNode next = last.next;
	    	last.next = pre;
	    	pre = last;
	    	last = next;
	    }
	    
	    while(head != null && pre != null){
	    	ListNode next = head.next.next;
	    	head.next = pre;
	    	head.next.next = next;
	    	pre = pre.next;
	    	head = next;
	    }
	    
	}
}
