class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int num:nums){
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
       for(int key:mpp.keySet()){
       if(mpp.get(key)==1){
        return key;
       } 
       }
       return -1;
    }
}