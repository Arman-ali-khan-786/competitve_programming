package leetcode;

public class searchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int r=0;
        for(int i = 0 ; i < m;i++){
            if(matrix[i][0]<=target && matrix[i][matrix[i].length-1]>=target){
                r=i;
            }
        }
        // System.out.println(r);
        for(int i = 0 ; i < matrix[r].length ; i++){
            //  System.out.println(matrix[r][i]);
            if(matrix[r][i] == target){
                return true;
            }
        }
        return false;
    }
    
}
