import java.util.Arrays;

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        if(arr.length==0){
            return -1;
        }
        Arrays.sort(arr);
        return arr[k-1];
    } 
}