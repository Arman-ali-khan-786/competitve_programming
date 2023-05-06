/*
  1498. Number of Subsequences That Satisfy the Given Sum Condition
  You are given an array of integers nums and an integer target.

Return the number of non-empty subsequences of nums such that the sum of the minimum and maximum element on it is less or equal to target. Since the answer may be too large, return it modulo 109 + 7.
*/

class Solution {
    public int numSubseq(int[] nums, int target) {
        int res = 0, mod = 1000000007,l=0,r=nums.length-1;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        for(int i =1 ;i<=nums.length;i++) al.add((al.get(i-1)<<1)%mod);
        Arrays.sort(nums);
        
        while(l<=r){
            if(nums[l]+nums[r]>target) r--;
            else res=(res+ al.get(r-l++))%mod;
        }
        return res;
    }
}
