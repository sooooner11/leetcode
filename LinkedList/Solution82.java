package leetcode;


public class Solution82 {
	class ListNode {
		int val;
	    ListNode next;
		ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pointer=head;
        if(head==null) return head;
        while(pointer!=null&&pointer.next!=null) {
        	while (pointer.next!=null&&pointer.val==pointer.next.val) {
        		deletenext(pointer);
        	}
        	pointer=pointer.next;
        }
        return head;
    }
    public void deletenext(ListNode p) {
    	p.next=p.next.next;
    }
    public static void main(String[] args) {
    	Solution82 s=new Solution82();
        ListNode l1=s.new ListNode(1);
    	ListNode l2=s.new ListNode(1);
    	ListNode l3=s.new ListNode(1);
    	ListNode l4=s.new ListNode(4);
    	ListNode l5=s.new ListNode(4);
    	ListNode l6=s.new ListNode(6);
    	l1.next=l2;
    	l2.next=l3;
    	l3.next=l4;
    	l4.next=l5;
    	l5.next=l6;
    	
    	ListNode ans=s.deleteDuplicates(l1);
    	System.out.println(ans);
    }
}
