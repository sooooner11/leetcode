package leetcode;

public class Solution318 {
    public int maxProduct(String[] words) {
        int n=words.length;
        if(n==0) return 0;
        int [] a=new int[n];
        for(int i=0;i<n;i++) {
        	for(char c:words[i].toCharArray())
        		a[i]|=1<<c-'a';
        }
        int max=0;
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if((a[i]&a[j])==0)
        			max=Math.max(words[i].length()*words[j].length(),max);
        	}
        }
        return max;
    }
}
