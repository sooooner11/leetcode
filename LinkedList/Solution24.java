package leetcode;



public class Solution24 {
	   class ListNode{
		   int val;
		   ListNode next;
		   ListNode(int x){val=x;}
	   }
    public ListNode swapPairs(ListNode head) {
    	if(head==null) return null;
        if(head.next==null) return head;
        ListNode ans=new ListNode(0);
        ans.next=head;
        ListNode p1=ans;
        ListNode p2=head;
        while(p2!=null&&p2.next!=null) {
        	
        	p1.next=p2.next;
        	p2.next=p1.next.next;
        	p1.next.next=p2;
        	p1=p2;
        	p2=p2.next;
        	
        }
        return ans.next;
    }
    
    public static void main(String[] args) {
    	Solution24 s=new Solution24();
        ListNode l1=s.new ListNode(1);
    	ListNode l2=s.new ListNode(2);
    	ListNode l3=s.new ListNode(3);
    	ListNode l4=s.new ListNode(4);
    	l1.next=l2;
    	l2.next=l3;
    	l3.next=l4;
    	s.swapPairs(l1);
    }
}
