package leetcode;

public class Solution260 {
    public int[] singleNumber(int[] nums) {
        int di=0;
        for(int num:nums) {
        	di^=num;
        }
        di&=-di;
        int [] ans=new int[2];
        for(int num:nums) {
        	if((num&di)==di) {
        		ans[0]^=num;
        	}
        	else 
        		ans[1]^=num;
        }
        return ans; 
    }
}
