class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }

        int x=0;
        if(nums[0]>nums[n-1]){
          x=0;  
        }else{
            x=n-1;
        }
        return x;
    }
}