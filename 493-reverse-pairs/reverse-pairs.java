class Solution {
    public int reversePairs(int[] nums) {
        return divide(nums,0,nums.length-1);
    }
    public int divide(int []nums,int low,int high){
        int count=0;
        if(low==high) return 0;
        int mid=(low+high)/2;
        count+=divide(nums,low,mid);
        count+=divide(nums,mid+1,high);
        count+=merge(nums,low,mid,high);
        return count;

    }

    public int merge(int []nums,int low,int mid,int high){
        int count=0;
        int right=mid+1;

        for(int left=low;left<=mid;left++){
            while(right<=high && nums[left]>2L*nums[right]){
                right++;
            }

            count+=right-(mid+1);
        }

        int left=low;
         right=mid+1;
        ArrayList<Integer> arr=new ArrayList<>();
        while(left<=mid && right<=high){
            
            if(nums[left]<=nums[right]){
                arr.add(nums[left++]);
            }else{
                arr.add(nums[right++]);
            }
        }
        while(left<=mid){
            arr.add(nums[left++]);
        }

        while(right<=high){
            arr.add(nums[right++]);
        }

        for(int i=low;i<=high;i++){
            nums[i]=arr.get(i-low);
        }

        return count;
    }
}