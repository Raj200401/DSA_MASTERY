class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        int sum=0;
        int length=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                length=Math.max(length,i+1);
            }
            if(!mpp.containsKey(sum)){
                mpp.put(sum,i);
            }
            if(mpp.containsKey(sum-k)){
                length=Math.max(length,i-mpp.get(sum-k));
            }
        }
        return length;
    }
}
