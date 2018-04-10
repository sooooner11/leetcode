package leetcode;

public class Solution231 {
    public boolean isPowerOfTwo(int n) {
    	int count=0;
        for(int i=0;i<32;i++) {
        	count=n&1;
        	n>>=1;
        }
        return count==1;
    }
}
