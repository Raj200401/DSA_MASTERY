class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int low=1;
        int high=arr[n-1]-arr[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr,k,mid)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
    }
    
    public boolean possible(int []arr,int k,int distance){
        int count_cows=1;
        int last_cow=arr[0];
        for(int i=1;i<arr.length;i++){
            if((arr[i]-last_cow)>=distance){
                count_cows++;
                last_cow=arr[i];
            }
            
            if(count_cows==k) return true;
        }
        
        return false;
    }
}