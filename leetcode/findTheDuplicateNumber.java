package leetcode;

// iven an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

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
