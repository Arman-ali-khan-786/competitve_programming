package potd;

public class countTheSubstrings {
    int countSubstring(String S) 
    { 
        // code here
        int c= 0;
        for(int i = 0 ; i<S.length();i++){
            int small=0,large=0;
            for(int j = i ; j<S.length();j++){
                if(S.charAt(j)>='a' && S.charAt(j) <= 'z') small++;
                if(S.charAt(j)>='A' && S.charAt(j)<='Z') large++;
                if(small==large) c++;
            }
        }
        return c;
    }
}
