import java.util.Arrays;

class Solution {
    public int missingNumber(int[] arr) {
       Arrays.sort(arr);
        int missing = 1; // The smallest positive integer we're looking for

        for (int num : arr) {
            if (num == missing) {
                missing++; // Move to the next expected positive integer
            } else if (num > missing) {
                return missing; // Found the missing number
            }
        }

        return missing;
       
        
        
    }
} 
    

