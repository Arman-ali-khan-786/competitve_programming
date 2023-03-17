import java.util.HashSet;

public class unionOf2Arrays {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
       HashSet<Integer> hs = new HashSet<>();
       while(--n>=0){
           hs.add(a[n]);
       }
       while(--m>=0){
           hs.add(b[m]);
       }
       
       return hs.size();
    }
}
