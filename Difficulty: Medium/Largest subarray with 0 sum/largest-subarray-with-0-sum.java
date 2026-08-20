class Solution {
    int maxLength(int arr[]){
    int n=arr.length;
    
    HashMap<Integer,Integer> mpp=new HashMap<>();
    int length=0;
    int max_length=0;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
        if(sum==0){
            length=i+1;
            max_length=Math.max(length,max_length);
        }
        
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
