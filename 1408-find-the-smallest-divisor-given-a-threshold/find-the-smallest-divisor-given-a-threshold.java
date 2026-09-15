class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max=0;
        
        for(int num:nums){
            max=Math.max(max,num);
            
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(nums,threshold,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    } 
    public boolean possible(int[]nums,int threshold,int divisor){
        int add=0;
        for(int i=0;i<nums.length;i++){
            add+=(int)Math.ceil((double)nums[i]/divisor);
            if(add>threshold) return false;
        }
        return true;
    } 
}