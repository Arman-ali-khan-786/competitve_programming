//############################# PROBLEM OF THE DAY - 24th March 2023 #################################################
// -------------------------------------------------------------------------------------------------------------------

// Given a string S which consists of only lowercase English alphabets, you have to perform the below operations:
// If the string S contains any repeating character, remove the first repeating character and reverse the string and again perform the above operation on the modified string, otherwise, you stop.
// You have to find the final string.

package potd;

import java.util.HashMap;
import java.util.HashSet;

public class removeAndReverse {
    String removeReverse(String S) 
    { 
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0, j=S.length()-1;
        boolean rev = false;
        HashSet<Integer> del = new HashSet<>();
        
        for(char ch : S.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        while(i<j){
            char first = S.charAt(i);
            char last = S.charAt(j);
            
            if(!rev){
                if(map.get(first) > 1){
                    map.put(first, map.get(first)-1);
                    del.add(i);
                    rev = !rev;
                }
                i++;
            } else {
                if(map.get(last) > 1){
                    map.put(last, map.get(last)-1);
                    del.add(j);
                    rev = !rev;
                }
                j--;
            }
        }
        StringBuilder ans = new StringBuilder();
        
        for(i=0; i<S.length(); i++){
            if(!del.contains(i)) ans.append(S.charAt(i));
        }
        if(rev) return ans.reverse().toString();
        
        return ans.toString();
    }
}
