import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class permutationOfAString {
    public static ArrayList<String> helper(String S,String ans,ArrayList<String> al){
        if(S.length()==0 && !al.contains(ans)){
            al.add(ans);
            return al;
        }
        for(int i = 0 ; i<S.length() ; i++){
            char ch = S.charAt(i);
            String lp = S.substring(0,i);
            String rp = S.substring(i+1);
            helper(lp+rp,ans+ch,al);
        }
        return al;
    }
    public List<String> find_permutation(String S) {
        // Code here
        ArrayList<String> al = new ArrayList<>();
        helper(S,"",al);
        Collections.sort(al);
        return al;
    }
}
