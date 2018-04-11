package leetcode;
public class Solution92 {
	 class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) return head;
        ListNode head2=new ListNode(0);
        head2.next=head;
        ListNode p=head2;
        for(int i=1;i<m;i++)
        	p=p.next;
        int i=n-m-1;
       
        ListNode p1=p.next;
        ListNode temp=p1;
        ListNode p2=p1.next;
        ListNode p3=p2.next;
        p2.next=p1;
        while(i>0) {
        	p1=p2;
        	p2=p3;
        	p3=p3.next;
        	p2.next=p1;
        	i--;
        }
        temp.next=p3;
        p.next=p2;
        return head2.next;
    }
    public static void main(String[] args) {
    	Solution92 s=new Solution92();
        ListNode l1=s.new ListNode(1);
    	ListNode l2=s.new ListNode(2);
    	ListNode l3=s.new ListNode(3);
    	ListNode l4=s.new ListNode(4);
    	ListNode l5=s.new ListNode(5);
    	ListNode l6=s.new ListNode(6);
    	l1.next=l2;
    	l2.next=l3;
    	l3.next=l4;
    	l4.next=l5;
    	//l5.next=l6;
    	s.reverseBetween(l1,2,4);
    }
}
