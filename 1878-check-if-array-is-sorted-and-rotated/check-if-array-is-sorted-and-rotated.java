class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int rotate=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                rotate++;
            }
        }
        if(nums[n-1]>nums[0]){
            rotate++;
        }
        if(rotate<=1){
            return true;
        }
        return false;
    }
}