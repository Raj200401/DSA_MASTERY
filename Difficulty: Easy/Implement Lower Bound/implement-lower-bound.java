class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        int index=n;
        while(low<=high){
            int mid=(low+high)/2;
            
            if(target==arr[mid]){
                index=mid;
                high=mid-1;
            }
            
            else if(target<arr[mid]){
                index=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return index;
    }
}
