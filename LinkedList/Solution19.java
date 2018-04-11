package leetcode;



public class Solution19 {
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val=x;}
	}
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=new ListNode(0);
        ListNode temp=slow;
        slow.next=head;
        ListNode fast=head;
        for(int i=0;i<n;i++) {
        	if(fast==null) return head;
        	fast=fast.next;
        }
        
        while(fast!=null) {
        	fast=fast.next;
        	slow=slow.next;
        }
        slow.next=slow.next.next;
        return temp.next;
    }
}
