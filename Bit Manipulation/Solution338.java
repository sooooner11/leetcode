package leetcode;

public class Solution338 {
    public int[] countBits(int num) {
        int[] dp=new int[num+1];
        int j=0,exp=1,i=1;
        while(i<=num) {
           j=0;
           while(i<=num&&j<exp) {
        	   dp[exp+j++]=1+dp[j];
        	   i++;
           }
           exp*=2;
        }
        return dp;
    }
}
