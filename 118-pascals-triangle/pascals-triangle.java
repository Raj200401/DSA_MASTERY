class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result=new ArrayList<>();
       for(int i=1;i<=numRows;i++){
        result.add(generate_row(i));
       }
       return result;
    }

    public List<Integer> generate_row(int row){
        ArrayList<Integer> arr=new ArrayList<>();
        
        int ans=1;
        arr.add(ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            arr.add(ans);
        }
        return arr;
    }
}