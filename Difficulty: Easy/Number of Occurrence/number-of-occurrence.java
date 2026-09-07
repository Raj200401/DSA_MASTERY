class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        return recursive(arr,target,0,n-1);
    }
    
    public int recursive(int[]arr,int target,int low,int high){
        int count=0;
        if(low>high) return 0;
        
        int mid=(low+high)/2;
        
        if(arr[mid]==target){
            count++;
            count+=recursive(arr,target,low,mid-1);
            count+=recursive(arr,target,mid+1,high);
        }else if(target<arr[mid]){
            count+=recursive(arr,target,low,mid-1);
        }else{
            count+=recursive(arr,target,mid+1,high);
        }
        
        return count;
    }
}
