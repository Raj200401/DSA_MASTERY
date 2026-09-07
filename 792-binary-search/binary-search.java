class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
       return recursive(nums,target,0,n-1);
    }

    public int recursive(int[]nums,int target,int low,int high){
        if(low>high) return -1;
        int mid=(low+high)/2;
        
        if(nums[mid]==target){
             return mid;
        }else if(target<nums[mid]){
        return recursive(nums,target,low,mid-1);
        }else{
        return recursive(nums,target,mid+1,high);
        }
        
    }
}