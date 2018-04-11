package leetcode;

public class Solution109 {
	  class TreeNode{
		   int val;
		   TreeNode left;
		   TreeNode right;
		   TreeNode(int val){this.val=val;}
	   }
	   class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
    public TreeNode sortedListToBST(ListNode head) {
        return build(head,null);
    }
    public TreeNode build (ListNode start,ListNode end) {
    	if(start==end) return null;
    	ListNode fast=start;
    	ListNode slow=start;
    	while(fast!=end&&fast.next!=end) {
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	TreeNode x=new TreeNode(slow.val);
    	x.left=build(start,slow);
    	x.right=build(slow.next,end);
    	return x;
    }
}
