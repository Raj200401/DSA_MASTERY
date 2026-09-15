class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int num:piles){
            max=Math.max(num,max);
        }
        int low=1;
        int high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(piles,h,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public boolean possible(int[]piles,int h,int speed){
        int add=0;
        for(int i=0;i<piles.length;i++){
            add+=(int)Math.ceil((double)piles[i]/speed);
            if(add>h) return false;
        }
        return true;
    }     
}
