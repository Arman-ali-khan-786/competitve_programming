//############################# PROBLEM OF THE DAY - 30th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------

// You are given an array A of size N. Let us denote S as the sum of all integers present in the array.
//  Among all integers present in the array, find the minimum integer X such that S ≤ N*X.

package potd;

public class minimumInteger {
    public static int minimumInteger(int N, int[] A) {
        // code here
        if(N==1) return A[0];
        long sum = 0;
        int min = Integer.MAX_VALUE; 
        for(int i : A){
            sum+=i;
        }
        for(int i : A){
            if(sum <= ((long)N *i)) min = Math.min(min,i);
        }
        
        return min;
    }
}
