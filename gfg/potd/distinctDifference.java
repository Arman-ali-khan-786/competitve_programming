//############################# PROBLEM OF THE DAY - 19th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------

// Given an array A[] of length N. For each index i (1<=i<=N),
// find the diffference between the number of distinct element in it's left and right side in the array. 


package potd;
import java.util.*;

class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int aux[] = new int[N];
        for(int i = N-1 ; i >=0 ; i--){
            aux[i] = hs.size();
            hs.add(A[i]);
        }
        hs.clear();
        
        for(int i = 0 ; i < N; i++){
            al.add(hs.size() - aux[i]);
            hs.add(A[i]);
        }
        
        return al;
    }
}