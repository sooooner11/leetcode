package leetcode;
import java.util.*;
public class Solution143 {
	  class ListNode{
		   int val;
		   ListNode next;
		   ListNode(int x){val=x;}
	   }
	  
  // recursive is too slow.It counts every node every time.	
	  
 /*  public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return ;
        ListNode temp=head;
        while(temp.next.next!=null)
        	temp=temp.next;
        ListNode p=head.next;
        head.next=temp.next;
        temp.next.next=p;
        temp.next=null;
        reorderList(p);
    }*/
	  public void reorderList(ListNode head) {
		  if(head==null||head.next==null||head.next.next==null) return ;
		  Stack<ListNode> stack=new Stack<>();
		  ListNode temp=head;
		  int n=0;
		  while(temp.next!=null) {
			  stack.push(temp);
			  temp=temp.next;
			  n++;
		  }
		  n=n/2;
		  ListNode start=head;
		  while(n>0) {
			  temp=stack.pop();
			  ListNode nextstart=start.next;
			  start.next=temp.next;
			  start.next.next=nextstart;
			  start=nextstart;
			  temp.next=null;
			  n--;
		  }
	  }
	  public static void main(String [] args) {
		  Solution143 s=new Solution143();
	        ListNode l1=s.new ListNode(1);
	    	ListNode l2=s.new ListNode(2);
	    	ListNode l3=s.new ListNode(3);
	    	ListNode l4=s.new ListNode(4);
	    	ListNode l5=s.new ListNode(5);
	    	l1.next=l2;
	    	l2.next=l3;
	    	l3.next=l4;
	    	l4.next=l5;
	    	s.reorderList(l1);
	    	s.reorderList(l1);
	    	
	  }
}
