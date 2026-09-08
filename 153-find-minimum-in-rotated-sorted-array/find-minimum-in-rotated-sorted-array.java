class Solution {
    public int findMin(int[] nums) {
      int n=nums.length;
      return recursive(nums,0,n-1);
    }

    public int recursive(int[]nums,int low,int high){

        if(low==high) return nums[low];

        int mid=(low+high)/2;

        if(nums[mid]>nums[high]){
            return recursive(nums,mid+1,high);
        }else{
            return recursive(nums,low,mid);
        }
    }
}