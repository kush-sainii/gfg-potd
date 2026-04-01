class Solution {
    public static int findEquilibrium(int arr[]) {
        int n=arr.length;
        int TotalSum=0;
        for(int i:arr)
        {
            TotalSum+=i;
        }
  
        int currSum=0;
        for(int j=0;j<n;j++)
        {
            if(TotalSum-arr[j]==2*currSum)
            {
                return j;
            }
            currSum+=arr[j];
        }
        return -1;

    }
}