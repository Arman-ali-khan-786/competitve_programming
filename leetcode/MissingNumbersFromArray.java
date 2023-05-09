/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : nums) set.add(i);
        for(int i =1 ; i<nums.length+1;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}
