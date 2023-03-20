package leetcode;

// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) 
// such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
//  For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.


public class searchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums.length == 1){
            if(nums[0] == target) return 0;
            else return -1;
        }
        int beg = 0 , mid = -1 , end = nums.length-1;
        while(beg<=end){
            mid = beg + (end - beg)/2;
            if( target == nums[mid]) return mid;
            else if( nums[beg]<=nums[mid]){
                if(target >= nums[beg] && target < nums[mid]) end = mid-1;
                else beg = mid+1;
            }else{
                if(target >= nums[mid] && target<=nums[end]) beg = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
}
