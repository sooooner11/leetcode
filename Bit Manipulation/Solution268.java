package leetcode;

public class Solution268 {
    public int missingNumber(int[] nums) {
        int ans=0,i=0;
        for(;i<nums.length;i++) {
        	ans^=i;
        	ans^=nums[i];
        }
        ans^=i;
        return ans;
    }
}
