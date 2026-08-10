class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int j=i+1;
            int max=0;
            while(j<n){
                if(arr[j]>max){
                    max=arr[j];
                }
                j++;
            }
            result.add(max);
        }
        result.add(-1);
        int sol[]=new int[result.size()];
        for(int i=0;i<result.size();i++){
            sol[i]=result.get(i);
        }
        return sol;
    }
}