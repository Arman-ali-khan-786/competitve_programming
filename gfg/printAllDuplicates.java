import java.util.HashMap;
import java.util.Map;

public class printAllDuplicates {

    // to print all the duplicates and their counts in the input string 

    public static void main(String[] args) {
        String str = "test  String";
        printDuplicates(str.toLowerCase());
    }

    private static void printDuplicates(String str) {
        HashMap<Character , Integer> hm = new HashMap<>();
        for(Character i : str.toCharArray()){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i, 1);
            }
        }

        for(Map.Entry<Character,Integer> ele : hm.entrySet()){
            if(ele.getValue()>1 && ele.getKey()!=' '){
                System.out.print(ele.getKey()+" ");
            }
        }
        System.out.println();
    }
}
