class Solution {
    int maxLength(int arr[]){
        HashMap<Integer,Integer> mpp=new HashMap<>();
    int n=arr.length;
    mpp.put(0,-1);
    int length=0;
    int max_length=0;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(mpp.containsKey(sum)){
            length=i-mpp.get(sum);
            max_length=Math.max(length,max_length);
        }else{
        mpp.put(sum,i);
        }
    }
    return max_length;
    
    }
}
