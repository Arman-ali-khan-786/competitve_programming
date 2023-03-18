package leetcode;

import java.util.HashSet;

public class findTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ele = -1;
        for(int i : nums){
            if(!hs.contains(i)){
                hs.add(i);
            }else{
                ele= i;
                break;
            }
        }
        return ele;
    }
}
