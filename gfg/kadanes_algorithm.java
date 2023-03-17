public class kadanes_algorithm{
     // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        if(n==0){
            return 0;
        }
        
        // Your code here
        long max_sum = Integer.MIN_VALUE;
        long curr_sum = 0;
        for(int i : arr){
            curr_sum+=i;
            if(curr_sum>max_sum){
                max_sum = curr_sum;
            }
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        
        return max_sum;
        
    }
}