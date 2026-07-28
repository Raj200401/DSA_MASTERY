class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                x++;
            }else{
                y=Math.max(x,y);
                x=0;
            }
        }
        return Math.max(x,y);
    }
}