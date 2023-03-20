import java.util.ArrayList;

public class firstAndLastOccurrencesOfX {
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> ans = new ArrayList<>();
        int i = 0;
        long fp = Integer.MAX_VALUE,lp=Integer.MIN_VALUE;
        boolean check = false;
        while(i<=n-1){
            if(arr[i] == x){
                check = true;
                fp = Math.min(fp,i);
                lp = Math.max(lp,i);
            }
            i++;
        }
       if(check){
            ans.add(fp);
        ans.add(lp);
       }else{
            ans.add((long)-1);
        ans.add((long)-1);
       }
        return ans;
    }
}
