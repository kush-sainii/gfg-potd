class Solution {
    public int minJumps(int[] arr) {
        int coverage = 0;
        int jump = 0;
        int n = arr.length-1;
        int lastJumpIdx = 0;
        for(int i = 0; i<n; i++) {
            coverage = Math.max(coverage, i+arr[i]);
            if(i == lastJumpIdx) {
                lastJumpIdx = coverage;
                jump++;
                if(coverage >= n) {
                    return jump;
                }
            }
        }
        return -1;
    }
}