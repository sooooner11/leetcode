package leetcode;

public class Solution190 {
    public int reverseBits(int n) {
        int ans=0;
        for(int i=0;i<31;i++) {
        	ans+=n&1;
        	n>>=1;
            if(i<30)
            	ans<<=1;
        }
        return ans;
    }
}
