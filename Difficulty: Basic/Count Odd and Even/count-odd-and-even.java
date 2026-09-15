class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n=arr.length;
        int odd=0;
        int even=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                odd++;
            }else{
                even++;
            }
        }
        return new int[]{odd,even};
    }
}