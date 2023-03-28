public class countNoOfSetBitsInARange {
    public static int countSetBits(int n){
    
        // Your code here
        if(n<=1) return n;
        int x = (int)(Math.log(n)/Math.log(2)); //log2(n)
        
        return (int)((int)Math.pow(2,x-1)*x)+(int)(n- (int)Math.pow(2,x)+1) + (int)countSetBits(n-(int)Math.pow(2,x));
        
    }
}
