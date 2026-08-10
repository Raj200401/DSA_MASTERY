class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
       if(n<=0) return 0;
        Arrays.sort(nums);
        int num=1;
        int maxi=0;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]==1){
                num++;
            }else if(nums[i]-nums[i-1]>1){
                maxi=Math.max(maxi,num);
                num=1;
            }
        }
        maxi=Math.max(maxi,num);
        return maxi;
    }
}