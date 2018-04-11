package leetcode;

public class Solution86 {
	  class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
      }
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null) return head;
        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode i=pre;
        ListNode j=head;
        while(j!=null&&j.val<x) {i=i.next;j=j.next;}
        if(j==null) return head;
        while(j.next!=null) {
        	if(j.next.val>=x) {j=j.next;continue;}
        	ListNode newnode=new ListNode(j.next.val);
        	newnode.next=i.next;
        	i.next=newnode;
        	i=newnode;
        	j.next=j.next.next;
        }
        return pre.next;
    }
    public static void main(String [] args) {
    	Solution86 s=new Solution86();
    	ListNode n1=s.new ListNode(3);
    	ListNode n2=s.new ListNode(1);
    	ListNode n3=s.new ListNode(2);
    	ListNode n4=s.new ListNode(5);
    	ListNode n5=s.new ListNode(5);
    	ListNode n6=s.new ListNode(5);
    	n1.next=n2;
    	n2.next=n3;
    	n3.next=n4;
    	n4.next=n5;
    	n5.next=n6;
    	System.out.print(s.partition(n1, 3));
    }
}
