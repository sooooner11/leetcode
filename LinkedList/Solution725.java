package leetcode;
public class Solution725 {
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
    public ListNode[] splitListToParts(ListNode root, int k) {
        if(root==null) return new ListNode[0];
        int n=0;
        ListNode x=root;
        while(x!=null) {
        	n++;
        	x=x.next;
        }
        ListNode[] ans=new ListNode[k];
        int a=n/k;
        int b=n%k;
        x=root;
        
        for(int i=0;i<k;i++) {
        	if(a+b>0) ans[i]=x;
        	else ans[i]=null;
        	ListNode pre=x;
        	for(int j=0;j<a+(b==0? 0:1);j++) {
        		pre=x;
        		x=x.next;
        	}
        	pre.next=null;
        	if(b>0)
        		b--;
        }
        return ans;
    }
}
