package leetcode;

public class Solution2 {
	
	class ListNode{
		int val;
		ListNode next;
		ListNode(int x){val=x;}
	}
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode line1=l1;
        ListNode line2=l2;
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        int hi=0;
        while(line1!=null||line2!=null) {
        	int sum=((line1==null)? 0:line1.val) +((line2==null)?0:line2.val)+hi;
        	int lo=sum%10;
        	temp.next=new ListNode(lo);
        	hi=sum/10;
        	temp=temp.next;
        	line1=(line1==null)? null:line1.next;
        	line2=(line2==null)? null:line2.next;
        }
        if(hi==1) {
        	temp.next=new ListNode(hi);
        }
        return ans.next;
    }
    public static void main(String[] args) {
    	Solution2 s=new Solution2();
    	ListNode l1=s.new ListNode(1);
    	
    	ListNode l3=s.new ListNode(9);
    	ListNode l4=s.new ListNode(9);
    	
    	
    	l3.next=l4;
    	
    	s.addTwoNumbers(l1, l3);
    }
}
