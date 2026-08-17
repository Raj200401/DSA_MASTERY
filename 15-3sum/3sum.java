class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>>set=new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer>st=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int sum=-nums[i]-nums[j];
          if(st.contains(sum)){
            List<Integer> temp=new ArrayList<>();
            temp.add(nums[i]);
            temp.add(nums[j]);
            temp.add(sum);
            Collections.sort(temp);
            set.add(temp);

          }
          st.add(nums[j]);

            }
        }
        ans.addAll(set);
        return ans;
    }
}