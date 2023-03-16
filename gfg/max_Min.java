class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<N;i++){
            if(min>A[i]){
                min = A[i];
            }
            if(max<A[i]){
                max = A[i];
            }
        }
        return min+max;
    }
}
