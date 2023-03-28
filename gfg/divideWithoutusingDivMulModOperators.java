public class divideWithoutusingDivMulModOperators {
    public static long divide(long a, long b)
    {
        //code here
        int sign=(a<0^b<0)?-1:1; 
        a=Math.abs(a);
        b=Math.abs(b);
        long res=0;
        for(int i=31;i>=0;i--){
            if((b<<i)<=a)
            {
                res=res+(1<<i);
                a=a-(b<<i);
            }
        }
        return sign*res;
    }
}
