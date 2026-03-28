import java.util.ArrayList;

class Solution {
    static int evenlyDivides(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            al.add(digit);
            n = n / 10;
        }
        int count = 0;
        for(int num : al) {
            if (num == 0) continue;
            else {
                if (temp % num == 0) count++;
            }
        }
        return count;
    }
}