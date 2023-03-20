public class noOfOnesInANumber {
    static int setBits(int N) {
        // code here
        if(N==0) return 0;
        if(N==1) return 1;
        int c =0 ;
        while(N>0){
            if((N&1)==1){
                c++;
            }
            N=N>>1;
            // or
        // N=(N& (N-1));
        // c++;
        }
        
        return c;
    }
}
