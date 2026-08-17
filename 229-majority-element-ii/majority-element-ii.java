class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0;
        int element1=0;
        int count2=0;
        int element2=0;

        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=element2){
                count1=1;
                element1=nums[i];
            }else if(count2==0 && nums[i]!=element1){
                count2=1;
                element2=nums[i];
            }else if(nums[i]==element1){
                count1++;
            }else if(nums[i]==element2){
                count2++;

            }else{
                count1--;
                count2--;
            }
        }

        List<Integer> list=new ArrayList<>();
        int c1=0;
        int c2=0;
        int min=n/3+1;
        for(int i=0;i<n;i++){
            if(element1==nums[i]){
                c1++;
            }else if(element2==nums[i]){
                c2++;
            }
        }

        if(c1>=min) list.add(element1);
        if(c2>=min) list.add(element2);
        return list;
    }
} 