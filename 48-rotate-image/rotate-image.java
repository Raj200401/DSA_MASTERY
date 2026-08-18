class Solution {
    public void rotate(int[][] matrix) {
     int m=matrix.length;
     int n=matrix[0].length;

     for(int i=0;i<m;i++){
        for(int j=i+1;j<n;j++){
            transpose(matrix,i,j);
        }
     }

     for(int i=0;i<m;i++){
        int j=0;
        int k=n-1;
        while(j<k){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[i][k];
            matrix[i][k]=temp;
            j++;
            k--;
        }
     }
    }

    public void transpose(int[][]matrix,int a,int b){
        int temp=matrix[a][b];
        matrix[a][b]=matrix[b][a];
        matrix[b][a]=temp;
    }
}