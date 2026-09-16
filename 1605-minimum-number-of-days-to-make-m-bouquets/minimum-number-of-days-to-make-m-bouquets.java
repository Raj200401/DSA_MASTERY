class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k) return -1;
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            min=Math.min(bloomDay[i],min);
            max=Math.max(bloomDay[i],max);
        }
            int low=min;
            int high=max;
            while(low<=high){
               int mid=(low+high)/2;

               if(possible(bloomDay,m,k,mid)){
                high=mid-1;
               }else{
                low=mid+1;
               }

            }
            return low;
        
}
public boolean possible(int[]bloomDay,int m,int k,int day){
    int count=0;
    int bouquet=0;
    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=day){
            count++;
        }else{
            bouquet+=(count/k);
            count=0;
        }
    }
    bouquet+=(count/k);
    if(bouquet>=m) return true;

    return false;
}
}