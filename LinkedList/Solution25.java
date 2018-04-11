package leetcode;
public class Solution25 {
	  class ListNode{
		   int val;
		   ListNode next;
		   ListNode(int x){val=x;}
	   }
    public ListNode reverseKGroup(ListNode head, int k) {
    	if(k<=1) return head;
        ListNode ans=new ListNode(0);
        ans.next=head;
        ListNode temp=ans,start=ans;
        int i=0;
        while(temp.next!=null) {
        	temp=temp.next;
        	i++;
        	if(i==k) {
        		i=0;
        		temp=start.next;
        		start.next=reverse(start,k);
        		start=temp;
        	}
        }
        return ans.next;
    }
    public ListNode reverse(ListNode head2, int k) {
        ListNode p=head2;
    
        ListNode p1=p.next;
        ListNode temp=p1;
        ListNode p2=p1.next;
        ListNode p3=p2.next;
        p2.next=p1;
        k-=2;
        while(k>0) {
        	p1=p2;
        	p2=p3;
        	p3=p3.next;
        	p2.next=p1;
        	k--;
        }
        temp.next=p3;
        p.next=p2;
        return head2.next;
    }
    public static void main(String[] args) {
    	Solution25 s=new Solution25();
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
    	s.reverseKGroup(l1,3);
    }
}
