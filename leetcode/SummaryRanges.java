/*
You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
*/

class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> ans = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int initial = nums[i];
            while(i+1<nums.length && nums[i+1]==nums[i]+1) i++;
            if(initial!=nums[i]) ans.add(""+initial+"->"+nums[i]);
            else ans.add(initial+""); i++;            
        }
        return ans;
    }
}
