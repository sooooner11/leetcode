package leetcode;



public class Solution61 {
	class ListNode {
		int val;
	    ListNode next;
		ListNode(int x) { val = x; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        int size=0;
        ListNode p1=new ListNode(0);
        p1.next=head;
        ListNode start=p1;
        ListNode end=p1;
        while(p1.next!=null) {
        	p1=p1.next;
        	size++;
        }
        if(k==0||size<=1||k%size==0) return head;
        int i=0;
        while(i!=size-k%size) {
        	end=end.next;
        	i++;
        }
        start.next=end.next;
        end.next=null;
        p1.next=head;
        return start.next;
    }
    public static void main(String[] args) {
    	Solution61 s=new Solution61();
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
    	l5.next=l6;
    	s.rotateRight(l1,3);
    }
}
