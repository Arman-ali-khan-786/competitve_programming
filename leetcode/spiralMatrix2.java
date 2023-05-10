/*

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

*/

class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int[n][n];
        int min_r=0,min_c=0;
        int max_r=n-1,max_c=n-1;
        int i = 1;
        while(i<=(n*n)){
            for(int j = min_c ; j<=max_c;j++) mat[min_r][j] = i++;
            if(min_c>max_c) break;
            min_r++;
            for(int j = min_r ; j<=max_r;j++) mat[j][max_c] = i++;
            if(min_r>max_r) break;
            max_c--;
            for(int j = max_c ; j>=min_c;j--) mat[max_r][j] = i++;
            if(max_c<min_c) break;
            max_r--;
            for(int j = max_r ; j>=min_r ; j--) mat[j][min_c] = i++;
            if(min_r>max_r) break;
            min_c++; 
        }
        return mat;
        
    }
}
