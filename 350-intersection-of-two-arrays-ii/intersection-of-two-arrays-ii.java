class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer,Integer> mpp=new HashMap<>();
      ArrayList<Integer> arr=new ArrayList<>();
      for(int num:nums1){
        mpp.put(num,mpp.getOrDefault(num,0)+1);
      }

      for(int num:nums2){
        if(mpp.getOrDefault(num,0)>0){
            arr.add(num);
            mpp.put(num,mpp.get(num)-1);
        }
      }
      int result[]=new int[arr.size()];
      for(int i=0;i<result.length;i++){
        result[i]=arr.get(i);
      }

      return result;
    }
}