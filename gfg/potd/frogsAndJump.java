//############################# PROBLEM OF THE DAY - 26th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------


// N frogs are positioned at one end of the pond. All frogs want to reach the other end of the pond as soon as possible. 
// The pond has some leaves arranged in a straight line. Each frog has the strength to jump exactly K leaves.
//  For example, a  frog having strength 2 will visit the leaves 2, 4, 6, ...  etc. while crossing the pond.

// Given the strength of each frog and the number of leaves, 
// your task is to find the number of leaves that not be visited by any of the 
// frogs when all frogs have reached the other end of the pond. 

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
