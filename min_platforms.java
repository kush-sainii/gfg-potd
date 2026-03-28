import java.util.Arrays;

class Solution {
    public int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int i = 0, j = 0;
        int cnt = 0;
        int maxcnt = -1;
        while(i<n && j<n) {
            if(arr[i]<=dep[j]) {
                cnt++;
                i++;
            } else {
                cnt--;
                j++;
            }
            maxcnt = Math.max(cnt, maxcnt);
        }
        return maxcnt;
        
    }
}