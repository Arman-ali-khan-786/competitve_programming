package potd;
import java.util.Arrays;

public class frogsAndJump {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        boolean l[] = new boolean[leaves+1];
        Arrays.fill(l,false);
        for(int i : frogs){
            if(i==1) return 0;
            if(i<=leaves && !l[i]){
                for(int j = i; j<=leaves ; j+=i){
                    l[j] = true;
                }
            }
        }
        int c = 0;
        for(boolean i : l){
            if(!i){
                c++;
            }
        }
        return c-1;
    }
}
