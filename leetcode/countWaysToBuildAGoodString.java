/*

Given the integers zero, one, low, and high, we can construct a string by starting with an empty string, and then at each step perform either of the following:

Append the character '0' zero times.
Append the character '1' one times.
This can be performed any number of times.

A good string is a string constructed by the above process having a length between low and high (inclusive).

Return the number of different good strings that can be constructed satisfying these properties. Since the answer can be large, return it modulo 109 + 7.

*/


class Solution {
    int mod = 1000000007;
    int memo[];
    public int pCGS(int low ,int high, int zero,int one, int i){
        if(i>high) return 0;

        if(memo[i]!=-1) return memo[i];

        memo[i] = i >= low && i <= high ? 1 : 0;
        memo[i] = (memo[i] + pCGS(low, high, zero, one, i + zero)) % mod;
        memo[i] = (memo[i] + pCGS(low, high, zero, one, i + one)) % mod;

        return memo[i];
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
       memo = new int[high+1];
       Arrays.fill(memo,-1);
       return pCGS(low,high,zero,one,0);
    }
}
