package leetcode;

public class Solution142 {
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode fast=head.next.next;
        ListNode slow=head.next;
        while(fast!=null&&fast.next!=null&&fast!=slow) {
        	fast=fast.next.next;
        	slow=slow.next;
        }
        if(fast==null||fast.next==null) return null;
        slow=head;
        while(fast!=slow) {
        	fast=fast.next;
        	slow=slow.next;
        }
        return fast;
    }
    public static void main(String [] args) {
    	Solution142 s=new Solution142();
    	ListNode n1=s.new ListNode(1);
    	ListNode n2=s.new ListNode(2);
    	ListNode n3=s.new ListNode(3);
    	ListNode n4=s.new ListNode(4);
    	ListNode n5=s.new ListNode(5);
    	ListNode n6=s.new ListNode(6);
    	n1.next=n2;
    	n2.next=n3;
    	n3.next=n4;
    	n4.next=n5;
    	n5.next=n6;
    	
    	System.out.print(s.detectCycle(n1).val);
    }
}
