class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int n = arr.length;
       ArrayList<Integer> al = new ArrayList<>(Collections.nCopies(n, -1)); // Initialize with -1
        
        for (int i = n - 1; i >= 0; i--) {
            // First pop all elements smaller than current
            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }
            
            // If stack has larger element, use it
            if (!stk.isEmpty()) {
                al.set(i, stk.peek());
            }
            
            // Push current element to stack
            stk.push(arr[i]);
        }
        
        return al;
    }
}