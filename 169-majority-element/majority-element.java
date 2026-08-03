class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int max=0;
        int max_frequency=0;
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }

        for(int key:mpp.keySet()){
            if(max_frequency<mpp.get(key)){
                max_frequency=mpp.get(key);
                max=key;
            }
        }
        return max;
    }
}