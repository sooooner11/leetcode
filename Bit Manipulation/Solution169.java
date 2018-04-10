package leetcode;

public class Solution169 {
    public int majorityElement(int[] nums) {
        int count=1,tag=nums[0];
        for(int i=1;i<nums.length;i++) {
        	if(count==0) {
        		count=1;
        		tag=nums[i];
        	}
        	else if(nums[i]==tag)
        		count++;
        	else 
        		count--;
        }
        return tag;
    }
}
