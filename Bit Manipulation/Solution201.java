package leetcode;

public class Solution201 {
    public int rangeBitwiseAnd(int m, int n) {
        if(m==0) return 0;
        int different=0;
        while(m!=n) {
        	different++;
        	m>>=1;
        	n>>=1;
        }
        return n<<different;
    }
}
