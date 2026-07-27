class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        operation(0,n-1,nums);
        operation(0,k-1,nums);
        operation(k,n-1,nums);
    }

    public void operation(int start,int end,int[]nums){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}