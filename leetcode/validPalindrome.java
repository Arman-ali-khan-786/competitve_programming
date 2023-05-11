/*

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

*/

class Solution {
   public boolean isPalindrome(String s) {
        if(s.length() == 0 && s.length() == 1) return true;
        s=s.toLowerCase();
        String pStr = "";
        for(char i : s.toCharArray()){
            if((i>=48 && i<=57)||(i>=97 && i<=122)) pStr+=i;
        }
        System.out.println(pStr);
        if(pStr.length()==0||pStr.length() == 1||pStr.compareTo(new StringBuffer(pStr).reverse().toString()) == 0) return true;
        return false;
    }
}
