package leetcode;

// Write a function that reverses a string. The input string is given as an array of characters s.

// You must do this by modifying the input array in-place with O(1) extra memory.

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
