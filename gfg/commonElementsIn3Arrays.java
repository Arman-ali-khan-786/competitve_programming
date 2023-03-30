import java.util.ArrayList;

public class commonElementsIn3Arrays {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here
        int i=0,j=0,k=0;
        ArrayList<Integer> al = new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                if(!al.contains(A[i])){
                    al.add(A[i]);
                }
                i++;
                j++;
                k++;
                 }
                else if(A[i]<B[j]){
                    i++;
                }
                else if(B[j]<C[k]){
                    j++;
                }
                else{
                    k++;
                }
        
        }return al; 
    }
}
