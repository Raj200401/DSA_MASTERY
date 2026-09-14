class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int n=piles.length;
   int max=0;
      
      for(int num:piles){
        max=Math.max(num,max);
      }
      long low=1;
      long high=max;
      while(low<=high){
        long mid=(low+high)/2;
        long hours=0;
        for(int i=0;i<n;i++){
            hours+=(piles[i]+mid-1)/mid;
        }
        if(hours<=h){
            high=mid-1;
        }else{
            low=mid+1;
        }
      }
      return (int)low;
    }
}