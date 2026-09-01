class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        return recursive(nums,0,n-1,target);
    }

    public int recursive(int []nums,int low,int high,int target){

        if(low>high) return -1;
       int mid=(low+high)/2;
       if(nums[mid]==target) return mid;
       if(nums[mid]>target){
        return recursive(nums,low,mid-1,target);
       }else{
        return recursive(nums,mid+1,high,target);
       }
       
    }
}