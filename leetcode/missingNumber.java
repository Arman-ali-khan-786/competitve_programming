/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 1 ; i <=len;i++) sum+=i;
        for(int i : nums) sum-=i;
        return sum;
    }
}
