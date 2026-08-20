class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result=new ArrayList<>();
        int n=nums.length;
        int count1=0;
        int ele1=0;
        int count2=0;
        int ele2=0;

        for(int i=0;i<n;i++){
            if(count1==0 && ele2!=nums[i]){
                ele1=nums[i];
                count1++;
            }else if(count2==0 && nums[i]!=ele1){
                ele2=nums[i];
                count2++;
            }else if(nums[i]==ele1){
                count1++;
            }else if(nums[i]==ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        int req=n/3+1;
        int c1=0;
        int c2=0;

        for(int i=0;i<n;i++){
            if(nums[i]==ele1){
                c1++;
            }else if(nums[i]==ele2){
                c2++;
            }
        }

        if(c1>=req) result.add(ele1);
        if(c2>=req) result.add(ele2);

        return result;
    }
} 