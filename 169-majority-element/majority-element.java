class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int element=nums[0];
        int count=0;
        for(int i=0;i<n;i++){
            if(element==nums[i]){
                count++;
            }else{
                count--;
            }

            if(count==0){
                element=nums[i+1];
            }
        }
        return element;
    }
}