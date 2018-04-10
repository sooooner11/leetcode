package leetcode;

public class Solution137 {
    public int singleNumber(int[] nums) {
        int one=0,two=0;
        for(int i=0;i<nums.length;i++) {
        	one=(one^nums[i])&~two;
        	two=(two^nums[i])&~one;
        }
        return one;
    }
}
