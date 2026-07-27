class Solution {
    public int removeDuplicates(int[] nums) {
       int n=nums.length;
       int i=0;
       int j=i+1;
       while(j<n){
        if(nums[i]==nums[j]){
            j++;
        }else{
            int temp=nums[j];
            nums[j]=nums[i+1];
            nums[i+1]=temp;
            i++;
            j++;
        }
       }
       return i+1; 
    }
}