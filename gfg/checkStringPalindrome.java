public class checkStringPalindrome {
    
    // Given a string S, check if it is palindrome or not.

    int isPalindrome(String S) {
        // code here
        if(S=="") return 1;
        if(S.length() == 1) return 1;
        int st = 0 , end = S.length()-1;
        while(st<=end){
            if(S.charAt(st)!=S.charAt(end)){
                return 0;
            }
            st++;
            end--;
        }
        return 1;
    }
}
