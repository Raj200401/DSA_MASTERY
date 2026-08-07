class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                result.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(result);
        return result;
    }
}
