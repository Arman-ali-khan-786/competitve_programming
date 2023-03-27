// to check any Character of lower ascii value comes after higher ascii value then return 0 otherwise 1

public class geekinaLovesOrder {
    public static int validString(int N,String S)
    {
        for(int i= 0 ; i<N-1;i++){
            if((int)(S.charAt(i)-'a') > (int)(S.charAt(i+1)-'a') ) return 0;
        }
        return 1;
    }
}
