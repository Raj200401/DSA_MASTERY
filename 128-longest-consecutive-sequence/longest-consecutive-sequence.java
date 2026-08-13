class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
       int current=0;
       int length=0;
       int longest=0;
       Set<Integer> set=new HashSet<>();
       for(int num:nums){
        set.add(num);
       }

       for(int num:set){
        if(!set.contains(num-1)){
            current=num;
            length=1;

            while(set.contains(current+1)){
                current++;
                length++;
            }
        }
        longest=Math.max(length,longest);
       }
       return longest;
    }
}