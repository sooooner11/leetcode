package leetcode;

public class Solution136 {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int in:nums) {
        	ans^=in;
        }
        return ans;
    }
}
