class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int sum=0;
        int times=0;
        mpp.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int remove=sum-k;
            times+=mpp.getOrDefault(remove,0);
            mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return times;
    }
}