class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;

        while(low<=high){
            int mid=low+(high-low)/2;
            long val=(long)mid*mid;
            if(val==x){
                return mid;
            }else if(val>x){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
}