public class countSquares {
    static int count_Squares(int N) {
        // code here
        int c = 0;
        for(int i = 1 ; i*i<N;i++) {
            if(i*i < N) c++;
        }
        return c;
    }
}
