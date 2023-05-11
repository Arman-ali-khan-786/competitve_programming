/*

You are given two integer arrays nums1 and nums2. We write the integers of nums1 and nums2 (in the order they are given) on two separate horizontal lines.

We may draw connecting lines: a straight line connecting two numbers nums1[i] and nums2[j] such that:

nums1[i] == nums2[j], and
the line we draw does not intersect any other connecting (non-horizontal) line.
Note that a connecting line cannot intersect even at the endpoints (i.e., each number can only belong to one connecting line).

Return the maximum number of connecting lines we can draw in this way.

*/


class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length , n = nums2.length;
        if(m<n) return maxUncrossedLines(nums2,nums1);
        int count[] = new int[n+1];

        for(int i = 1 ; i <=m ; i++){
            int prev = 0;
            for(int j = 1 ; j<=n ; j++){
                int curr = count[j];
                if(nums1[i-1] == nums2[j-1]){
                    count[j] = prev+1;
                }else{
                    count[j] = Math.max(count[j-1],curr);
                }
                prev = curr;
            }
        }
        return count[n];
    }
}
