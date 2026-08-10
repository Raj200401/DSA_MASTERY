class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest=0;
       Set<Integer> h1=new HashSet<>();
       for(int num:nums){
        h1.add(num);
       }
       for(int num:h1){
        if(!h1.contains(num-1)){
            int current=num;
            int length=1;

            while(h1.contains(current+1)){
            current++;
            length++;
        }
        longest=Math.max(longest,length);
        }

        
       }
        
        return longest;
    }
}