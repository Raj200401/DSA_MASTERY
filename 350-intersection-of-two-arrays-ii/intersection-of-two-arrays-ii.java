class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]<nums2[right]){
                left++;
            }else if(nums1[left]>nums2[right]){
                right++;
            }else{
                arr.add(nums1[left]);
                left++;
                right++;
            }
        }

        int[]result=new int[arr.size()];
        for(int i=0;i<result.length;i++){
            result[i]=arr.get(i);
        }
        return result;
    }
}