public class reverseString {
    public static String reverseWord(String str)
    {
        // Reverse the string str
        if(str.length()==0){
            return str;
        }
        return reverseWord(str.substring(1,str.length()))+str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverseWord("Arman"));
    }
}
