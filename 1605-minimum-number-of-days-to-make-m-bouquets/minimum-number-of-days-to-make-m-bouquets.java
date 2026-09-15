class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int num:bloomDay){
            max=Math.max(max,num);
            min=Math.min(min,num);
        }
        int low=min;
        int high=max;
        if(n<(long)m*k) return -1;

        while(low<=high){
        int mid=low+(high-low)/2;

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