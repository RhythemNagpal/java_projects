class Solution {
    public int longestPalindromeSubseq(String s) {
int dp[][]=new int[s.length()][s.length()];
      return palin(s,0,s.length()-1,dp);
    }
    int palin(String s,int start,int end,int dp[][])
    {
    if(start==end)
    {
     dp[start][end]=1;
        return 1;
    }
        if(start>end)
        return 0;
    
    int result;
    if(dp[start][end]!=-1)
        return dp[start][end];
        
    if(s.charAt(start)==s.charAt(end))
        {
        dp[start][end]=palin(s,start+1,end-1,dp)+2;
        return dp[start][end];
        }
    else
    {
            dp[start][end]=Math.max(palin(s,start+1,end,dp),palin(s,start,end-1,dp));
        return dp[start][end];
        
    }
        
    
}}