class Solution {
    public int getSecondLargest(int[] arr) {
        int firstLargest=Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>firstLargest)
            {
                firstLargest=arr[i]; 
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondlargest && arr[i]!=firstLargest)
            {
                secondlargest=arr[i];
            }
        }
        return (secondlargest==Integer.MIN_VALUE) ?-1:secondlargest;
    }
}