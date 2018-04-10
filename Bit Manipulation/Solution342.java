package leetcode;

public class Solution342 {
    public boolean isPowerOfFour(int num) {
    	if(num==1) return true;
    	if(num<4) return false;
    	int count1=0,count2=0;
    	count2+=num&1;
    	while(num!=0) {
    		num>>=1;
    		count2+=num&1;
    		num>>=1;
            count1+=num&1;
    	}
    	return count1==1&&count2==0;
    }
    public static void main(String [] args) {
    	Solution342 s=new Solution342();
    	System.out.print(s.isPowerOfFour(16));
    }
}
