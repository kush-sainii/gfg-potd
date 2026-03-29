class Solution {
    static Boolean isSubsetSum(int arr[], int sum) {
        int n = arr.length;
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i = 0; i<n; i++) {
            dp[i][0]=true;
        }
        for(int i = 1; i<dp[0].length; i++) {
            dp[0][i]=false;
        }
        
        for(int i = 1; i<dp.length; i++) {
            for(int j = 1; j<dp[0].length; j++) {
                if(arr[i-1]<=j) {
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
        
    }
}