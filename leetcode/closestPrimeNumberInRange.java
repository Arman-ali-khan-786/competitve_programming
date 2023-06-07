/*

Given two positive integers left and right, find the two integers num1 and num2 such that:

left <= nums1 < nums2 <= right .
nums1 and nums2 are both prime numbers.
nums2 - nums1 is the minimum amongst all other pairs satisfying the above conditions.
Return the positive integer array ans = [nums1, nums2]. If there are multiple pairs satisfying these conditions, return the one with the minimum nums1 value or [-1, -1] if such numbers do not exist.

A number greater than 1 is called prime if it is only divisible by 1 and itself.


*/

class Solution {
    public int[] closestPrimes(int left, int n) {
        boolean prime[] = new boolean[n+1];
        int ans[] = {-1,-1};
        prime[1] = true;
        for(int i = 2 ; i*i <=n ; i++){
            for(int j = i*i ; j<=n ; j+=i){
                prime[j] = true;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = left ; i <=n ; i++){
            if(!prime[i]) res.add(i);
        }
        if(res.size()<2) return ans;
        int min = Integer.MAX_VALUE;
        int f = 0,s=0;
        for(int i = 1 ; i<res.size() ; i++){
            if((res.get(i)-res.get(i-1)) < min){
                min = res.get(i)-res.get(i-1);
                 System.out.println(min);
                s=res.get(i);
                f=res.get(i-1);
            }
        }
        ans[0] = f;
        ans[1] = s;
        System.out.println(res);
        return ans;
    }
}
