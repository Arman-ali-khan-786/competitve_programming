import java.util.ArrayList;

public class spirallyTraverseAMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here
        ArrayList<Integer> al  = new ArrayList<>();
        int max_row = r-1,max_col = c-1;
        int min_row = 0,min_col = 0;
        while(true){
            for(int i = min_col ; i<=max_col ; i++){
                al.add(matrix[min_row][i]);
            }
            if(min_col>max_col) break;
            
            min_row++;
            for(int i = min_row ; i <= max_row ; i++){
                al.add(matrix[i][max_col]);
            }
            if(min_row > max_row) break;
            
            max_col--;
            for(int i = max_col ; i>=min_col ; i--){
                al.add(matrix[max_row][i]);
            }
            if(max_col<min_col) break;
            
            max_row--;
            for(int i = max_row ; i >= min_row ; i--){
                al.add(matrix[i][min_col]);
            }
            if(max_row<min_row) break;
            
            min_col++;
        }
        
        return al;
        
    }
    
}
