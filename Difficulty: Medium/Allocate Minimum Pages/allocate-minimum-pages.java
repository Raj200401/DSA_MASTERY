class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(k>n) return -1;
        long max=0;
        int min=0;
        for(int num:arr){
            min=Math.max(num,min);
            max+=num;
            
        }
        long low=min;
        long high=max;
        while(low<=high){
    long mid=low+(high-low)/2;
            if(possible(arr,k,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return (int)low;
        
    }
    
    public boolean possible(int []arr,int k,long pages){
        int student_count=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>pages){
                student_count++;
                sum=arr[i];
            }
           
        }
        
         if(student_count<=k) return true;
         
         
        return false;
    } 
}