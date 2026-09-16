class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
            max=Math.max(max,weights[i]);
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(weights,days,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean possible(int[]weights,int days,int weight){
        int count=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>weight){
                sum=weights[i];
                count++;
            }
        }
        
        if(count<=days) return true;

        return false;
    }
}