package leetcode;

public class Solution148 {
	  public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		 }
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode slow=head,fast=head,cut=head;
        while(fast!=null&&fast.next!=null) {
        	cut=slow;
        	slow=slow.next;
        	fast=fast.next.next;
        }
        cut.next=null;
        ListNode p1=sortList(head);
        ListNode p2=sortList(slow);
        return merge(p1,p2);
    }
    public ListNode merge(ListNode p1,ListNode p2) {
    	ListNode head=new ListNode(0);
    	ListNode p=head;
    	while(p1!=null&&p2!=null) {
    		if(p1.val<=p2.val) {
    			p.next=p1;
    			p1=p1.next;
    		}
    		else {
    			p.next=p2;
    			p2=p2.next;
    		}
    		p=p.next;
    	}
    	if(p1!=null) {
    		p.next=p1;
    	}
    	else 
    		p.next=p2;
    	return head.next;
    }
}
