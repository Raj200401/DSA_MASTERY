class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       int n=nums.length;
       List<List<Integer>> result=new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<n;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int j=i+1;
        int k=n-1;
        
        while(j<k){
            ArrayList<Integer> arr=new ArrayList<>();
        int sum=nums[i]+nums[j]+nums[k];
        if(sum==0){
            arr.add(nums[i]);
            arr.add(nums[j]);
            arr.add(nums[k]);
            
            j++;
            k--;
            result.add(arr);

            while(j<k && nums[j]==nums[j-1]) j++;
            while(j<k && nums[k]==nums[k+1]) k--;
        }else if(sum>0){
            k--;
        }else if(sum<0){
            j++;
        }

       }
       }

       
       return result;
    }
}