class Solution {
    public static int findSum(int n) {
        if(n==0) {
            
            return 0;
            
        }
        
        int sum= n+findSum(n-1);
        return sum;
    }
}