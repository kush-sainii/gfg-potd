class Solution {
    public int binarysearch(int[] arr, int k) {
        int left=0,right=arr.length-1;
        int val=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==k)
            {
                 val=mid;
                 right=mid-1;
            }
            else if(arr[mid]<k)
            {
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return val;
        
    }
}

