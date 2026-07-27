class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int greatest=arr[0];
        int second_largest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>greatest){
                second_largest=greatest;
                greatest=arr[i];
                
            }else if(arr[i]>second_largest && arr[i]!=greatest){
                second_largest=arr[i];
            }
        }
        if(greatest==second_largest){
            return -1;
        }else{
            return second_largest;
        }
    }
}