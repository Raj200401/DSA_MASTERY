class Solution {
    public int inversionCount(int arr[]) {
        // code here
        return divide(arr,0,arr.length-1);
    }
    
    public int divide(int []arr,int low,int high){
        int count=0;
        if(low>=high) return 0;
        int mid=(low+high)/2;
        count+=divide(arr,low,mid);
        count+=divide(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    
    public int merge(int []arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                ans.add(arr[left++]);
            }else{
                count+=mid-left+1;
                ans.add(arr[right++]);
            }
        }
        
        while(left<=mid){
            ans.add(arr[left++]);
        }
        while(right<=high){
            ans.add(arr[right++]);
        }
        
        for (int i=low;i<=high;i++){
            arr[i]=ans.get(i-low);
            
        }
        return count;
    }
}