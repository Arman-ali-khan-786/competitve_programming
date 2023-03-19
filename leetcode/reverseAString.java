package leetcode;

public class reverseAString {
    public void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        char temp;
        while (start <= end) {
            if (s[start] != s[end]) {
                temp = s[start];
                s[start] = s[end];
                s[end] = temp;
            }
            start++;
            end--;
        }
    }
}
