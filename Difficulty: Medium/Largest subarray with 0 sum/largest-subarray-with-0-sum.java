class Solution {
    int maxLength(int arr[]){
    int n=arr.length;
    
    HashMap<Integer,Integer> mpp=new HashMap<>();
    int max_length=0;
    int sum=0;
    int length=0;
    mpp.put(0,-1);
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
