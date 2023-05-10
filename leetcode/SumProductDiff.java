/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
*/

class Solution {
    public int subtractProductAndSum(int n) {
        String t = n+"";
        char digits[] = t.toCharArray();
        int sum = 0, product =1;
        for(char i : digits){
            sum+=Character.getNumericValue(i);
            product*= Character.getNumericValue(i);
        }
        return product-sum;
    }
}
