class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        ArrayList<Integer> result=new ArrayList<>();
        int n=nums.length;
        int great=n/3;
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }

        for(int num:mpp.keySet()){
            if(mpp.get(num)>great){
                result.add(num);
            }
        }
        return result;
    }
} 