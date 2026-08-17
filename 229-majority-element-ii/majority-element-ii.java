class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        int n=nums.length;
        int min=n/3+1;
        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
            if(mpp.get(nums[i])==min){
                result.add(nums[i]);
            }
        }
        return result;
    }
} 