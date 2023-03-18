//############################# PROBLEM OF THE DAY - 18th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------

package potd;
import java.util.Arrays;

public class MedianOfSubArrays {
    long helper(int A[],int n,int m){
        int[] map = new int[2*n+1];
        Arrays.fill(map,0);
        long cur = n,tot=0,res=0;
        map[(int)cur]++;
        for(int i = 0 ; i<n ; i++){
            int x = -1;
            if(A[i]>=m){
                x=1;
            }
            if(x==-1){
                tot-=map[(int)(cur+x)];
            }else{
                tot +=map[(int)cur];
            }
            cur+=x;
            res+=tot;
            map[(int)cur]++;
        }
        return res;
    }
    long countSubarray(int N, int A[], int M) 
    { 
        // code here
        return helper(A,N,M)-helper(A,N,M+1);
        
    }
}
