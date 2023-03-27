import java.util.Stack;

public class reverseStringUsingStack {
    public String reverse(String S){
        //code here
        Stack<Character> stk = new Stack<>();
        for(char i : S.toCharArray()){
            stk.push(i);
        }
        String str="";
        while(!stk.isEmpty()){
            str+=stk.pop();
        }
        return str;
    }
}