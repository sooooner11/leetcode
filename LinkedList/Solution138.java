package leetcode;
import java.util.*;
 class RandomListNode{
	 int label;
	 RandomListNode next,random;
	 RandomListNode(int x){label=x;}
	 RandomListNode(){;}
}
public class Solution138 {

     public RandomListNode copyRandomList(RandomListNode head) {
    	 if(head==null) return null;
    	 RandomListNode head2=new RandomListNode(head.label);
         RandomListNode x=head;
         HashMap<RandomListNode,RandomListNode> nodes=new HashMap<>();
         nodes.put(head, head2);
         while(x!=null) {
        	 RandomListNode next;
        	 RandomListNode random;
        	 RandomListNode current;
        	
             current=nodes.get(x);
        	 if(x.next!=null) {
        	    if(!nodes.containsKey(x.next)) {
        		   next=new RandomListNode(x.next.label);
        		   nodes.put(x.next,next);
        	    }
        	    else {
        		   next=nodes.get(x.next);
        	    }
        	    current.next=next;
        	 }
        	 if(x.random!=null) {
        	    if(!nodes.containsKey(x.random)) {
        		   random=new RandomListNode(x.random.label);
        		   nodes.put(x.random, random);
        	    }
        	    else {random=nodes.get(x.random);}
        	    current.random=random;
        	 }
        	 x=x.next;
         }
         return head2;
         
     }
     public static void main(String[] args) {
    	 Solution138 s=new Solution138();
    	 RandomListNode head=new RandomListNode(1);
    	 RandomListNode node2=new RandomListNode(2); 
    	 RandomListNode node3=new RandomListNode(3);
    	 RandomListNode node4=new RandomListNode(4);
    	 head.next=node2;
    	 head.random=node4;
    	 node2.next=node3;
    	 node2.random=node4;
    	 node3.random=node4;
    	 node3.next=node4;
    	 s.copyRandomList(head);
     }
}
