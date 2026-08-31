class Solution {
    public int inversionCount(int arr[]) {
        // code here
        return divide(arr,0,arr.length-1);
        
    }
    
    public int divide(int arr[],int low,int high){
        int count=0;
        if(low>=high) return 0;
        int mid=(low+high)/2;
        count+=divide(arr,low,mid);
        count+=divide(arr,mid+1,high);
        count+=merge(arr,low,high,mid);
        
        return count;
    }
    
    public int merge(int arr[],int low,int high,int mid){
        int count=0;
        int left=low;
        int right=mid+1;
        ArrayList<Integer> result=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                result.add(arr[left++]);
            }else{
                result.add(arr[right++]);
                count+=mid-left+1;
            }
        }
        
        while(left<=mid){
            result.add(arr[left++]);
        }
        while(right<=high){
            result.add(arr[right++]);
        }
        
        for(int i=low;i<=high;i++){
            arr[i]=result.get(i-low);
        }
        return count;
    }
}