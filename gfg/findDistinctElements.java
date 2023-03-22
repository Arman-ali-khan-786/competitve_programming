import java.util.HashMap;

// Given a N x N matrix M. Write a program to find count of all the distinct elements common to all rows of the matrix.
//  Print count of such elements.

public class findDistinctElements {
    static int distinct(int M[][], int N)
    {
        if(N==1) return 1;
        
        // code here
        int c =0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i<N;i++){
            hm.put(M[0][i],1);
        }
        
        for(int i = 1 ; i<N ;i++){
            for(int j = 0 ; j < N ;j++){
                if(hm.get(M[i][j]) !=null && hm.get(M[i][j])==i){
                    hm.put(M[i][j], hm.get(M[i][j])+1);
                    if(i == N-1){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}
