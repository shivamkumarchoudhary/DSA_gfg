class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int low =0;
        int high =n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>k)
            high = mid-1;
            
            else if(arr[mid]<k)
                low=mid+1;
            
            else{
                if( mid==0||arr[mid-1]!=arr[mid])
                return mid;
                
                else
                 high =mid-1;
                
            }
            
        }
        return -1;
    }
}