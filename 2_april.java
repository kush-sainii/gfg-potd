class Solution {
    int countWays(int n, int k) {

        if (n == 1) return k;
        if (n == 2) return k * k;

        int same = k;          
        int diff = k * (k - 1); 

        for (int i = 3; i <= n; i++) {
            int prevSame = same;
            int prevDiff = diff;

            same = prevDiff; 
            diff = (prevSame + prevDiff) * (k - 1);
        }

        return same + diff;
    }
}