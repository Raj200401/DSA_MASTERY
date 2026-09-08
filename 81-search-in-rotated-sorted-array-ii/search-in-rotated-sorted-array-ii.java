class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        return recursive(nums,target,0,n-1);
    }
    public boolean recursive(int[]nums,int target,int low,int high){
        if(low>high) return false;
        int mid=(low+high)/2;

        if(nums[mid]==target){
            return true;
        }else if(nums[low]==nums[mid] && nums[mid]==nums[high]){
            low++;
            high--;
            return recursive(nums,target,low,high);
        }
        else{
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    return recursive(nums,target,low,mid-1);
                }else{
                    return recursive(nums,target,mid+1,high);
                }
            }else{
                if(nums[mid]<target &&target<=nums[high]){
                    return recursive(nums,target,mid+1,high);
                }else{
                    return recursive(nums,target,low,mid-1);
                }
            }
        }
    } 
}