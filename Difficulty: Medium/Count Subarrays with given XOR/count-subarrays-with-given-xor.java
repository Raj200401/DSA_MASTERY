class Solution {
    public long subarrayXor(int arr[], int k) {
       
       int n=arr.length;
       int xor=0;
       long count=0;
       
       HashMap<Integer,Integer> mpp=new HashMap<>();
       mpp.put(0,1);
       for(int i=0;i<n;i++){
           xor=xor^arr[i];
           
           int req=xor^k;
           count+=mpp.getOrDefault(req,0);
           
           mpp.put(xor,mpp.getOrDefault(xor,0)+1);
       }
       return count;
}}
